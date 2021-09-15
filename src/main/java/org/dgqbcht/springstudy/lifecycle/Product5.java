package org.dgqbcht.springstudy.lifecycle;

/**
 * 用于演示对象的初始化。
 */
public class Product5 {

    /**
     * 对象创建时，会使用构造器，打印信息。
     */
    public Product5() {
        System.out.println("Product5.Product5");
    }

    /**
     * 自定义初始化方法
     */
    public void init(){
        System.out.println("Product5 custom initializing method invoked.");
    }
}
