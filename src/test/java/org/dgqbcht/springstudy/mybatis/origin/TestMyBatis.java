package org.dgqbcht.springstudy.mybatis.origin;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.InputStream;

public class TestMyBatis {


    /**
     * 测试使用mybatis插入对象
     */
    @Test
    public void testInsert(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis/origin/mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            UserDAO userDAO = session.getMapper(UserDAO.class);
            User user = new User();
            user.setUsername("zhangsan");
            user.setPassword("123456");
            userDAO.insert(user);
            session.commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 测试使用mybatis查找对象
     */
    @Test
    public void testLogin(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis/origin/mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            UserDAO userDAO = session.getMapper(UserDAO.class);
            User user = new User();
            user.setUsername("zhangsan");
            user.setPassword("123456");
            user = userDAO.login(user);
            System.out.println("user.getId() = " + user.getId());
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 测试使用mybatis修改对象
     */
    @Test
    public void testUpdate(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis/origin/mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            UserDAO userDAO = session.getMapper(UserDAO.class);
            User user = new User();
            user.setUsername("zhangsan");
            user.setPassword("123456");
            user = userDAO.login(user);
            user.setPassword("999999");
            userDAO.update(user);
            session.commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 测试使用mybatis删除对象
     */
    @Test
    public void testDelete(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis/origin/mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            UserDAO userDAO = session.getMapper(UserDAO.class);
            User user = new User();
            user.setUsername("zhangsan");
            user.setPassword("999999");
            user = userDAO.login(user);
            userDAO.delete(user);
            session.commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
