package app.service;

import app.model.User;

import java.util.List;

public interface UserService {
    User findUserByName(String s);
    void saveUser();
    List<User> getAllUsers();
}
