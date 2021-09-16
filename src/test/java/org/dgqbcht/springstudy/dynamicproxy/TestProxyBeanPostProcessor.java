package org.dgqbcht.springstudy.dynamicproxy;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProxyBeanPostProcessor {
    private static ApplicationContext context;

    /**
     * 提前配置Spring的ApplicationContext
     */
    @BeforeClass
    public static void beforeClass() {
        context = new ClassPathXmlApplicationContext("/applicationContextProxyBeanPostProcessor.xml");
    }

    /**
     * 测试模拟Spring框架生产动态代理
     */
    @Test
    public void testProxyBeanPostProcessor() {
        UserService userService = (UserService) context.getBean("userService1");
        userService.login("zhangsan","123456");
        userService.register(new User());
    }
}
