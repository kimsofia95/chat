package app.controller;

import app.model.User;
import app.service.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

@Controller
public class ChatController {
    private final UserService userService;

    public ChatController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String nicknameInput(ModelMap model) {
        return "login";
    }

    @GetMapping(value = "/chats")
    public String chatPage(ModelMap model, @AuthenticationPrincipal User user) throws ParserConfigurationException, TransformerException {
        userService.saveUser(user);
        model.addAttribute("user", user);
        return "chat";
    }
}