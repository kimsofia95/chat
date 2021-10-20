package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ChatController {

    @GetMapping(value = "/")
    public String nicknameInput(ModelMap model) {
        return "login";
    }

    @GetMapping(value = "/chats")
    public String chatPage(ModelMap model) {
        return "chat";
    }
}