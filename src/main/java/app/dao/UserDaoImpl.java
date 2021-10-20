package app.dao;

import app.model.User;
import org.springframework.stereotype.Repository;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
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
    public void saveUser(User user) throws ParserConfigurationException, TransformerException {
        File myObj = new File("logs/data.xml");
        String path = myObj.getAbsolutePath();
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
