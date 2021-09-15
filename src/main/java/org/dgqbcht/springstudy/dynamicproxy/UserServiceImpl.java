package org.dgqbcht.springstudy.dynamicproxy;

public class UserServiceImpl implements UserService{

    @Override
    public void register(User user) {
        System.out.println("UserServiceImpl.register");
        System.out.println("user = " + user);
    }

    @Override
    public boolean login(String username, String password) {
        System.out.println("UserServiceImpl.login");
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return true;
    }
}
