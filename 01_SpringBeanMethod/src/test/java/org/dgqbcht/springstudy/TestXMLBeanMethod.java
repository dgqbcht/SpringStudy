package org.dgqbcht.springstudy;

import org.dgqbcht.springstudy.pojo.xml.Person;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXMLBeanMethod {
    private static ApplicationContext context;

    /**
     * 提前配置Spring的ApplicationContext
     */
    @BeforeClass
    public static void beforeClass() {
        context = new ClassPathXmlApplicationContext("/applicationContextXML.xml");
    }

    /**
     * 测试用bean的id创建实例，需要强制转换类型。
     */
    @Test
    public void testGetBeanById(){
        Person person = (Person) context.getBean("person");
        System.out.println("person = " + person);
    }

    /**
     * 测试用bean的id创建实例，不需要强制转换类型。
     */
    @Test
    public void testGetBeanById2(){
        Person person = context.getBean("person", Person.class);
        System.out.println("person = " + person);
    }

    /**
     * 测试用bean的name创建实例。
     */
    @Test
    public void testGetBeanByName(){
        Person person1 = (Person) context.getBean("p");
        System.out.println("person1 = " + person1);
        Person person2 = (Person) context.getBean("pp");
        System.out.println("person2 = " + person2);
    }

    /**
     * 测试containsBeanDefinition方法。
     */
    @Test
    public void testContainsBeanDefinition(){
        //用id定义过person
        boolean contains = context.containsBeanDefinition("person");
        System.out.println("contains person = " + contains);
        contains = context.containsBeanDefinition("p");
        //id唯一，但name可以有多个。
        //用name定义p1、pp1，当存在id时，name失效。
        System.out.println("contains p = " + contains);
        contains = context.containsBeanDefinition("pp");
        System.out.println("contains pp = " + contains);

        //未用id定义，用name定义p1、pp1，当不存在id时，第一个name生效。
        contains = context.containsBeanDefinition("p1");
        System.out.println("contains p1 = " + contains);
        contains = context.containsBeanDefinition("pp1");
        System.out.println("contains pp1 = " + contains);
    }

    /**
     * 测试containsBean方法。
     */
    @Test
    public void testContainsBean(){
        //用id定义过person
        boolean contains = context.containsBean("person");
        System.out.println("contains person = " + contains);
        contains = context.containsBean("p");
        //id唯一，但name可以有多个。
        //用name定义p、pp。
        System.out.println("contains p = " + contains);
        contains = context.containsBean("pp");
        System.out.println("contains pp = " + contains);

        //未用id定义，只用name定义p1、pp1。
        contains = context.containsBean("p1");
        System.out.println("contains p2 = " + contains);
        contains = context.containsBean("pp1");
        System.out.println("contains pp2 = " + contains);
    }

}
