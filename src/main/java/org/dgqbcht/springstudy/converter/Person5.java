package org.dgqbcht.springstudy.converter;

import java.util.Date;

public class Person5 {
    private String name;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person5{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
