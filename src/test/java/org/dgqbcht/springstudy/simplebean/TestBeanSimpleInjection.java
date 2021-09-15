package org.dgqbcht.springstudy.simplebean;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanSimpleInjection {
    private static ApplicationContext context;

    /**
     * 提前配置Spring的ApplicationContext
     */
    @BeforeClass
    public static void beforeClass()  {
        context = new ClassPathXmlApplicationContext("/applicationContextBeanSimpleInjection.xml");
    }

    /**
     * 测试用property标签注入属性值。
     */
    @Test
    public void testInjectionByTags() {
        Person2 person2=(Person2) context.getBean("person2");
        System.out.println("person2 = " + person2);
    }

    /**
     * 测试用命名空间p:注入属性值。
     */
    @Test
    public void testInjectionByAttributes() {
        Person2 person2=(Person2) context.getBean("person2_new");
        System.out.println("person2 = " + person2);
    }
}
