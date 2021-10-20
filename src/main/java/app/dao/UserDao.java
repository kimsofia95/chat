package app.dao;

import app.model.User;

import java.util.List;

public interface UserDao {
    User findUserByName(String s);
    void saveUser();
    List<User> getAllUsers();
}
