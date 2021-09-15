package org.dgqbcht.springstudy.complexbean;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class TestParameterization {
    private static ApplicationContext context;

    /**
     * 提前配置Spring的ApplicationContext
     */
    @BeforeClass
    public static void beforeClass() {
        context = new ClassPathXmlApplicationContext("/applicationContextParameterization.xml");
    }


    /**
     * 测试配置文件参数化
     */
    @Test
    public void testParameterization() {
        //conn注入属性时，用的是db.properties文件中的值
        Connection conn = (Connection) context.getBean("conn");
        System.out.println("conn = " + conn);
    }
}
