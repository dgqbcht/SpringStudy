package org.dgqbcht.springstudy.simplebean;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanComplexInjection {
    private static ApplicationContext context;

    /**
     * 提前配置Spring的ApplicationContext
     */
    @BeforeClass
    public static void beforeClass() {
        context = new ClassPathXmlApplicationContext("/applicationContextBeanComplexInjection.xml");
    }

    /**
     * 测试注入集合类型与自定义类型，使用property标签。
     */
    @Test
    public void testCustomInjection() {
        Person3 person3 = (Person3) context.getBean("person3");
        System.out.println("person3 = " + person3);
    }

    /**
     * 测试注入自定义类型，用使p:命名空间。
     */
    @Test
    public void testCustomInjection2() {
        Person3 person3 = (Person3) context.getBean("person3_new");
        System.out.println("person3 = " + person3);
    }
}
