package org.dgqbcht.springstudy.mybatis.service.property;

import org.dgqbcht.springstudy.mybatis.entity.User;

public interface UserService {
    void register(String username, String password);
    User login(String username, String password);
}
