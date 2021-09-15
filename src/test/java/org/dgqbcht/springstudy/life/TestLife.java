package org.dgqbcht.springstudy.life;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife {

    /**
     * 测试对象创建的时间。
     */
    @Test
    public void testCreate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //product1为singleton模式，会在spring工厂创建时创建，直接被调用构造器。
        //product2为prototype模式，在获取对象时才创建，不执行以下代码，则不调用构造器。
        Product2 product2 = (Product2) context.getBean("product2");
        //product3为singleton模式，配置属性lazy-init="true"，在获取对象时才创建。
        Product3 product3 = (Product3) context.getBean("product3");
    }

    /**
     * 测试对象的初始化方法被调用
     */
    @Test
    public void testInitializing() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //Product4实现了InitializingBean接口，创建后会自动初始化，不需要额外配置，但产生的spring框架的入侵。
        //Product5中提供了一个普通的方法进行初始化，通过bean的init-method属性配置，也可以实现自动初始化。
        /*Product6既实现了InitializingBean接口，又配置了init-method属性，先执行注入，然后执行afterPropertiesSet方法，
         *最后执行自定义初始化方法。
         */
    }

    /**
     * 测试对象的销毁方法被调用
     */
    @Test
    public void testDestroy(){
        //销毁方法只适用于bean的scope="singleton" ！
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //Product7既实现了DisposableBean接口，又配置了destroy-method属性。
        //销毁时先调用destroy方法，后调用自定义的销毁方法。

        //Spring工厂关闭时，会自动执行销毁方法。
        context.close();
    }
}
