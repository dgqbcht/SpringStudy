package org.dgqbcht.springstudy;

import org.dgqbcht.springstudy.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    /**
     * 用bean id创建实例
     */
    @Test
    public void testGetBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person) context.getBean("person");
        System.out.println("person = " + person);
    }

    /**
     * 测试注入bean属性
     */
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person) context.getBean("person");
//        通过代码赋值，存在耦合
//        person.setId(1);
//        person.setName("Chen");
        System.out.println("person = " + person);
    }
}
