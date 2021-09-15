package org.dgqbcht.springstudy.lifecycle;

import org.springframework.beans.factory.InitializingBean;

/**
 * 用于演示对象初始化。
 */
public class Product4 implements InitializingBean {

    /**
     * 对象创建时，会使用构造器，打印信息。
     */
    public Product4() {
        System.out.println("Product4.Product4");
    }

    /**
     * 对象被创建后，spring检测到实现了InitializingBean接口，会自动调用该方法。
     */
    @Override
    public void afterPropertiesSet() {
        System.out.println("Product4 afterPropertiesSet initializing method invoked.");
    }

}
