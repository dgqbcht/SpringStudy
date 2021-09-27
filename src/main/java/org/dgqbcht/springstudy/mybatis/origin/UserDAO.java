package org.dgqbcht.springstudy.mybatis.origin;

public interface UserDAO {
    void insert(User user);
    User login(User user);
    void update(User user);
    void delete(User user);

}
