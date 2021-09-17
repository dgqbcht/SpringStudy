package org.dgqbcht.springstudy.dynamicproxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 用annotation进行aop开发。
 */
@Aspect
public class AnnotationAOP {

    @Pointcut("execution(* *..UserServiceImpl.*(..))")
    public void pointcut(){}

    @Around(value = "pointcut()")
    public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("---Annotation AOP Before Log---");
        Object ret = joinPoint.proceed();
        System.out.println("---Annotation AOP After Log---");
        return ret;
    }

    @Around(value = "pointcut()")
    public Object aroundTransaction(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("---Annotation AOP Before Transaction---");
        Object ret = joinPoint.proceed();
        System.out.println("---Annotation AOP After Transaction---");
        return ret;
    }

}
