package org.dgqbcht.springstudy.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson2 {

    /**
     * 测试用property标签注入属性值。
     */
    @Test
    public void testInjection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person2 person2=(Person2) context.getBean("person2");
        System.out.println("person2 = " + person2);
    }

    /**
     * 测试用命名空间p:注入属性值。
     */
    @Test
    public void testInjection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person2 person2=(Person2) context.getBean("person2_new");
        System.out.println("person2 = " + person2);
    }
}
