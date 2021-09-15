package org.dgqbcht.springstudy.simplebean;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanConstructorInjection {
    private static ApplicationContext context;

    /**
     * 提前配置Spring的ApplicationContext
     */
    @BeforeClass
    public static void beforeClass() {
        context = new ClassPathXmlApplicationContext("/applicationContextBeanConstructorInjection.xml");
    }

    /**
     * 测试使用构造器进行注入
     * 反向控制：所谓IoC，就是把对于成员变量赋值的控制权，从代码中反转(转移)到Spring工厂和配置文件中完成。
     * 好处：解耦合
     * 底层实现：工厂设计模式
     */
    @Test
    public void testConstructorInjection() {
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
