package org.dgqbcht.springstudy.factorybean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class TestParameterize {

    /**
     * 测试配置文件参数化
     */
    @Test
    public void testParameterize() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext1.xml");
        //conn注入属性时，用的是db.properties文件中的值
        Connection conn = (Connection) context.getBean("conn");
        System.out.println("conn = " + conn);
    }
}
