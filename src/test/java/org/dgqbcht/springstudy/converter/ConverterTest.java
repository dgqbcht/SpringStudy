package org.dgqbcht.springstudy.converter;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConverterTest {
    private static ApplicationContext context;

    /**
     * 提前配置Spring的ApplicationContext
     */
    @BeforeClass
    public static void beforeClass() {
        context = new ClassPathXmlApplicationContext("/applicationContextConverter.xml");
    }

    /**
     * 测试注入时用自定义的DateConverter将字符串转为日期类型
     */
    @Test
    public void testDefaultConverter() {
        Person5 person =(Person5) context.getBean("person5");
        System.out.println("person = " + person);
    }
}
