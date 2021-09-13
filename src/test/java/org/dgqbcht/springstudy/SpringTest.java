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
}
