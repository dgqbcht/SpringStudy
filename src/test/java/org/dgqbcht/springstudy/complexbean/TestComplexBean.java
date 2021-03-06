package org.dgqbcht.springstudy.complexbean;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class TestComplexBean {
    private static ApplicationContext context;

    /**
     * 提前配置Spring的ApplicationContext
     */
    @BeforeClass
    public static void beforeClass() {
        context = new ClassPathXmlApplicationContext("/applicationContextComplexBean.xml");
    }

    /**
     * 测试使用FactoryBean，注入复杂对象。
     */
    @Test
    public void testFactoryBean() {
        //直接调用bean的id，得到复杂对象。
        Connection conn = (Connection) context.getBean("conn1");
        System.out.println("conn = " + conn);
        //想获得FactoryBean，在id前加&符号。
        MySQLConnectionFactoryBean factoryBean = (MySQLConnectionFactoryBean) context.getBean("&conn1");
        System.out.println("factoryBean = " + factoryBean);
        //singleton = false，每次会创建新的实例。
        conn = (Connection) context.getBean("conn1");
        System.out.println("conn = " + conn);
    }

    /**
     * 测试使用实例工厂创建复杂对象，避免spring框架入侵，整合遗留系统。(只有class文件)
     */
    @Test
    public void testFactory() {
        MySQLConnectionFactory connFactory = (MySQLConnectionFactory) context.getBean("connFactory");
        System.out.println("connFactory = " + connFactory);
    }

    /**
     * 测试静态实例工厂创建复杂对象。
     */
    @Test
    public void testStaticFactory() {
        //静态方法名要写在bean的属性里，factory-method="getConnection"。
        Connection conn = (Connection) context.getBean("conn2");
        System.out.println("conn = " + conn);
    }

    /**
     * 测试使用bean的scope属性控制单例模式。
     */
    @Test
    public void testScope() {
        //使用scope="singleton"，默认可以不写。
        Connection conn = (Connection) context.getBean("conn3");
        System.out.println("conn = " + conn);
        conn = (Connection) context.getBean("conn3");
        System.out.println("conn = " + conn);
        //使用scope="prototype"
        conn = (Connection) context.getBean("conn4");
        System.out.println("conn = " + conn);
        conn = (Connection) context.getBean("conn4");
        System.out.println("conn = " + conn);
    }
}
