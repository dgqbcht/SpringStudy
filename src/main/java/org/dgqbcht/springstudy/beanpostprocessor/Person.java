package org.dgqbcht.springstudy.beanpostprocessor;

import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean {
    private String name;

    public Person() {
        System.out.println("Person.Person");
        System.out.println("person = " + this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println("Person.afterPropertiesSet");
        System.out.println("person = " + this);
    }

    public void init(){
        System.out.println("Person.init");
        System.out.println("person = " + this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
