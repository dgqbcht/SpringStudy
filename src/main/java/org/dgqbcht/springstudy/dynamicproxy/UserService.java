package org.dgqbcht.springstudy.dynamicproxy;

public interface UserService {
    void register(User user);
    boolean login(String username, String password);
}
