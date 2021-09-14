package org.dgqbcht.springstudy.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson4 {

    /**
     * 测试使用构造器进行注入
     */
    @Test
    public void testConstructor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //构造器参数个数不同，可通过constructor-arg个数区分，按照顺序传参数。
        Person4 person4 = (Person4) context.getBean("person4");
        System.out.println("person4 = " + person4);
        //构造器参数个数相同同，不可区分，需要规定constructor-arg type=。
        person4 = (Person4) context.getBean("person4_s");
        System.out.println("person4 = " + person4);
        person4 = (Person4) context.getBean("person4_i");
        System.out.println("person4 = " + person4);
    }
}
