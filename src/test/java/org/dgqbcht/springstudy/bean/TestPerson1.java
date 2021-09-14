package org.dgqbcht.springstudy.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson1 {

    /**
     * 测试用bean的id创建实例，需要强制转换类型。
     */
    @Test
    public void testGetBeanById(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person1 person = (Person1) context.getBean("person1");
        System.out.println("person = " + person);
    }

    /**
     * 测试用bean的id创建实例，不需要强制转换类型。
     */
    @Test
    public void testGetBeanById2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person1 person = context.getBean("person1", Person1.class);
        System.out.println("person = " + person);
    }

    /**
     * 测试用bean的name创建实例
     */
    @Test
    public void testGetBeanByName(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person1 person = (Person1) context.getBean("p1");
        System.out.println("person = " + person);
        Person1 person2 = (Person1) context.getBean("pp1");
        System.out.println("person2 = " + person2);
    }

    /**
     * 测试containsBeanDefinition方法。
     */
    @Test
    public void testContainsBeanDefinition(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //用id定义过person1
        boolean contains = context.containsBeanDefinition("person1");
        System.out.println("contains person1 = " + contains);
        contains = context.containsBeanDefinition("p1");
        //id唯一，但name可以有多个。
        //用name定义p1、pp1，当存在id时，name失效。
        System.out.println("contains p1 = " + contains);
        contains = context.containsBeanDefinition("pp1");
        System.out.println("contains pp1 = " + contains);

        //未用id定义，用name定义p2、pp2，当不存在id时，第一个name生效。
        contains = context.containsBeanDefinition("p2");
        System.out.println("contains p2 = " + contains);
        contains = context.containsBeanDefinition("pp2");
        System.out.println("contains pp2 = " + contains);
    }

    /**
     * 测试containsBean方法。
     */
    @Test
    public void testContainsBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //用id定义过person1
        boolean contains = context.containsBean("person1");
        System.out.println("contains person1 = " + contains);
        contains = context.containsBean("p1");
        //id唯一，但name可以有多个。
        //用name定义p1、pp1。
        System.out.println("contains p1 = " + contains);
        contains = context.containsBean("pp1");
        System.out.println("contains pp1 = " + contains);

        //未用id定义，只用name定义p2、pp2。
        contains = context.containsBean("p2");
        System.out.println("contains p2 = " + contains);
        contains = context.containsBean("pp2");
        System.out.println("contains pp2 = " + contains);
    }



}
