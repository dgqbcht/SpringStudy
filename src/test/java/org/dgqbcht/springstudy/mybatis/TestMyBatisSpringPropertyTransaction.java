package org.dgqbcht.springstudy.mybatis;

import org.dgqbcht.springstudy.mybatis.entity.User;
import org.dgqbcht.springstudy.mybatis.service.property.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBatisSpringPropertyTransaction {

    /**
     * 测试spring整合mybatis 使用annotation方式管理事物
     */
    @Test
    public void testMybatisSpringAnnotationTransaction(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("mybatis/property/applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.register("wangwu","888888");
        User user=userService.login("wangwu","888888");
        System.out.println("user.getId() = " + user.getId());
    }
}
