package org.dgqbcht.springstudy.dynamicproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 底层使用cglib框架实现动态代理。
 */
public class CglibProxy {
    public static void main(String[] args) {
        UserService2 userService = new UserService2();
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(CglibProxy.class.getClassLoader());
        enhancer.setSuperclass(userService.getClass());
        MethodInterceptor interceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("---Cglib Proxy Before Log---");
                Object ret = method.invoke(userService,objects);
                System.out.println("---Cglib Proxy After Log---");
                return ret;
            }
        };
        enhancer.setCallback(interceptor);
        UserService2 userServiceProxy=(UserService2)enhancer.create();
        userServiceProxy.register(new User());
        userServiceProxy.login("zhangsan","123456");

    }
}
