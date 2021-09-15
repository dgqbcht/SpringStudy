package org.dgqbcht.springstudy.lifecycle;

import org.springframework.beans.factory.InitializingBean;

/**
 * 用于演示对象初始化。
 */
public class Product6 implements InitializingBean {
    private String name;

    /**
     * set方法，演示注入与初始化的顺序
     */
    public void setName(String name) {
        System.out.println("Product6.setName:" + name);
        this.name = name;
    }

    /**
     * 对象创建时，会使用构造器，打印信息。
     */
    public Product6() {
        System.out.println("Product6.Product6");
    }

    /**
     * 对象被创建后，spring检测到实现了InitializingBean接口，会自动调用该方法。
     */
    @Override
    public void afterPropertiesSet() {
        System.out.println("Product6 afterPropertiesSet initializing method invoked.");
    }

    /**
     * 自定义初始化方法
     */
    public void init(){
        System.out.println("Product6 custom initializing method invoked.");
    }

}
