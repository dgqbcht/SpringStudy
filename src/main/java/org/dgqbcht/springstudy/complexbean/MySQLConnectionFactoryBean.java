package org.dgqbcht.springstudy.complexbean;

import java.sql.Connection;
import org.springframework.beans.factory.FactoryBean;

import java.sql.DriverManager;

/**
 * 创建复杂对象方法1，通过实现FactoryBean接口。
 */
public class MySQLConnectionFactoryBean implements FactoryBean<Connection> {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Override
    public Connection getObject() throws Exception {
        Connection conn=null;
        Class.forName(driverClassName);
        conn = DriverManager.getConnection(url,username,password);
        return conn;
    }

    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
