package org.dgqbcht.springstudy.dynamicproxy;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAnnotationAOP {
    private static ApplicationContext context;
    /**
     * 提前配置Spring的ApplicationContext
     */
    @BeforeClass
    public static void beforeClass() {
        context = new ClassPathXmlApplicationContext("/applicationContextAnnotationAOP.xml");
    }

    /**
     * 测试使用注解进行AOP开发
     */
    @Test
    public void testAnnotationAOP() {
        UserService userService=(UserService) context.getBean("userService2");
        userService.login("zhangsan","123456");
        userService.register(new User());
    }
}
