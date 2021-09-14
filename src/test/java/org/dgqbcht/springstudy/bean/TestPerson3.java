package org.dgqbcht.springstudy.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson3 {

    /**
     * 测试注入集合类型与自定义类型，使用property标签。
     */
    @Test
    public void testCustomInjection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person3 person3 = (Person3) context.getBean("person3");
        System.out.println("person3 = " + person3);
    }

    /**
     * 测试注入自定义类型，用使p:命名空间。
     */
    @Test
    public void testCustomInjection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person3 person3 = (Person3) context.getBean("person3_new");
        System.out.println("person3 = " + person3);
    }
}
