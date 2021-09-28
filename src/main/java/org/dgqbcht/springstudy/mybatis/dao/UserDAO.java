package org.dgqbcht.springstudy.mybatis.dao;

import org.dgqbcht.springstudy.mybatis.entity.User;

public interface UserDAO {
    void insert(User user);
    User login(User user);
    void update(User user);
    void delete(User user);

}
