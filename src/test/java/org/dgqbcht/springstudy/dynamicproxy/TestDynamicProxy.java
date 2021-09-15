package org.dgqbcht.springstudy.dynamicproxy;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDynamicProxy {
    private static ApplicationContext context;

    /**
     * 提前配置Spring的ApplicationContext
     */
    @BeforeClass
    public static void beforeClass() {
        context = new ClassPathXmlApplicationContext("/applicationContextDynamicProxy.xml");
    }

    /**
     * 测试动态代理的MethodBeforeAdvice
     */
    @Test
    public void testBeforeAdvisor() {
        UserService service =(UserService) context.getBean("userService");
        User user = (User)context.getBean("user");
        service.register(user);
        service.login("zhangsan","123456");

    }
}
