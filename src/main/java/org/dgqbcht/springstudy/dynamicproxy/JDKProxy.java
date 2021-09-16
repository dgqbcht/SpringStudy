package org.dgqbcht.springstudy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 底层使用Java反射实现动态代理。
 */
public class JDKProxy {
    public static void main(String[] args) {
        //java 8.0之前，内部类如果想访问外部的对象，需要声明时加final关键字。
        UserService userService = new UserServiceImpl();

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("---JDK Proxy Before Log---");
                Object ret = method.invoke(userService,args);
                System.out.println("---JDK Proxy After Log---");
                return ret;
            }
        };

        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),
                userService.getClass().getInterfaces(),handler);
        userServiceProxy.login("zhangsan","123456");
        userServiceProxy.register(new User());
    }
}
