package app.dao;

import app.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User findUserByName(String s) {
        User user = new User();
        user.setNickname("test");
        return user;
    }

    @Override
    public void saveUser() {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
