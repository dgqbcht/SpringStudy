package org.dgqbcht.springstudy.bean;

/**
 * 使用构造器进行注入
 */
public class Person4 {
    private String name;
    private long id;

    public Person4(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public Person4(long id) {
        this.id = id;
    }

    public Person4(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person4{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
