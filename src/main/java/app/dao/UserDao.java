package app.dao;

import app.model.User;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.List;

public interface UserDao {
    User findUserByName(String s);
    void saveUser(User user) throws ParserConfigurationException, TransformerException;
    List<User> getAllUsers();
}
