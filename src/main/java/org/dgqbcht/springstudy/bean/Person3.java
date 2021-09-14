package org.dgqbcht.springstudy.bean;

import java.util.*;

/**
 * 注入5种集合类型+1种自定义类型
 */
public class Person3 {
    String[] strings;
    Set<String> set;
    List<String> list;
    Map<String,String> map;
    Properties props;
    Person2 person2;

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setPerson2(Person2 person2) {
        this.person2 = person2;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "strings=" + Arrays.toString(strings) +
                ", set=" + set +
                ", list=" + list +
                ", map=" + map +
                ", props=" + props +
                ", person2=" + person2 +
                '}';
    }
}
