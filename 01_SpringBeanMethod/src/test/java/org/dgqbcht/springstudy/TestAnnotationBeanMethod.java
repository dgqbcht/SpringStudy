package org.dgqbcht.springstudy;

import org.dgqbcht.springstudy.pojo.annotation.Person;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationBeanMethod {
    private static ApplicationContext context;

    /**
     * 提前配置Spring的ApplicationContext
     */
    @BeforeClass
    public static void beforeClass() {
        context = new ClassPathXmlApplicationContext("/applicationContextAnnotation.xml");
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
     * 测试使用class创建实例
     */
    @Test
    public void testGetBeanById3(){
        Person person = context.getBean(Person.class);
        System.out.println("person = " + person);
    }
    /**
     * 测试containsBeanDefinition方法。
     */
    @Test
    public void testContainsBeanDefinition(){
        boolean contains = context.containsBeanDefinition("person");
        System.out.println("contains person = " + contains);
    }

    /**
     * 测试containsBean方法。
     */
    @Test
    public void testContainsBean(){
        boolean contains = context.containsBean("person");
        System.out.println("contains person = " + contains);
    }

}
