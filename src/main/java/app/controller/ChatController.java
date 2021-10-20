package app.controller;

import app.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ChatController {

    @GetMapping(value = "/")
    public String nicknameInput(ModelMap model) {
        return "login";
    }

    @GetMapping(value = "/chats")
    public String chatPage(ModelMap model, Authentication authentication) {
        model.addAttribute("user", authentication);
        return "chat";
    }
}