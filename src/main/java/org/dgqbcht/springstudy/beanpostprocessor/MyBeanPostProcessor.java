package org.dgqbcht.springstudy.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     * 初始化前自动调用。
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization");
        if(bean instanceof Person){
            Person person = (Person)bean;
            System.out.println("person = " + person);
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    /**
     * 初始化后自动调用。
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor.postProcessAfterInitialization");
        if(bean instanceof Person){
            Person person = (Person)bean;
            person.setName("^_^"+ person.getName());
        }
        if(bean instanceof Product){
            Product product = (Product) bean;
            product.setPrice(product.getPrice() + 100);
        }
        return bean;
    }
}
