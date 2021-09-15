package org.dgqbcht.springstudy.lifecycle;

/**
 * 用于演示对象创建时机。
 */
public class Product1 {

    /**
     * 对象创建时，会使用构造器，打印信息。
     */
    public Product1() {
        System.out.println("Product1.Product1");
    }
}
