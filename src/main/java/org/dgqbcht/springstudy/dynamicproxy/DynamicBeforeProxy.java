package org.dgqbcht.springstudy.dynamicproxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


public class DynamicBeforeProxy implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) {
        System.out.println("Before log: invoke method "+ method.getName());
        System.out.println("method = " + method);
    }
}
