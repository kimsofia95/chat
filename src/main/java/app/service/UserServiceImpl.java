package app.service;

import app.dao.UserDao;
import app.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findUserByName(String s) {
        return userDao.findUserByName(s);
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
