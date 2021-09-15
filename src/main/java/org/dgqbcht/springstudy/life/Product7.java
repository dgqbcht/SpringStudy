package org.dgqbcht.springstudy.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 用于演示对象销毁。
 */
public class Product7 implements DisposableBean {

    /**
     * 对象创建时，会使用构造器，打印信息。
     */
    public Product7() {
        System.out.println("Product7.Product7");
    }

    /**
     * spring检测到实现了DisposableBean接口，销毁时会自动调用该方法。
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("Product7 destroy method invoked.");

    }

    /**
     * 自定义销毁方法
     */
    public void dispose(){
        System.out.println("Product7 custom disposal method invoked.");
    }

}
