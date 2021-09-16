package org.dgqbcht.springstudy.dynamicproxy;

import org.dgqbcht.springstudy.dynamicproxy.User;

public class UserService2 {

    public void register(User user) {
        System.out.println("UserService.register");
    }

    public boolean login(String username, String password) {
        System.out.println("UserService.login");
        return true;
    }
}
