package org.dgqbcht.springstudy.mybatis.service.property;

import org.dgqbcht.springstudy.mybatis.dao.UserDAO;
import org.dgqbcht.springstudy.mybatis.entity.User;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void register(String username, String password) {
        User user= new User();
        user.setUsername(username);
        user.setPassword(password);
        userDAO.insert(user);
    }

    @Override
    public User login(String username, String password) {
        User user= new User();
        user.setUsername(username);
        user.setPassword(password);
        return userDAO.login(user);
    }
}
