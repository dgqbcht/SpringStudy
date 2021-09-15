package org.dgqbcht.springstudy.beanpostprocessor;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanPostProcessor {
    private static ApplicationContext context;

    /**
     * 提前配置Spring的ApplicationContext
     */
    @BeforeClass
    public static void beforeClass() {
        context = new ClassPathXmlApplicationContext("/applicationContextBeanPostProcessor.xml");
    }

    /**
     * 测试生产Person实例。
     */
    @Test
    public void testPerson() {
        //加入BeanPostProcessor后，完整创建过程：
        //1.调用类构造器
        //2.调用BeanPostProcessor的postProcessBeforeInitialization方法
        //3.注入属性
        //4.调用InitializingBean接口的afterPropertiesSet方法
        //5.调用自定义的初始化方法，由bean标签的init-method属性定义。
        //6.调用BeanPostProcessor的postProcessAfterInitialization方法
        Person person = (Person) context.getBean("person");
        System.out.println("person = " + person);
    }

    /**
     * 测试生产Product实例。
     */
    @Test
    public void testProduct() {
        Product product=(Product) context.getBean("product");
        System.out.println("product = " + product);
    }
}
