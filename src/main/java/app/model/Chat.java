package app.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Chat {
   private Long chatId;
   private ArrayList<Message> messages;
   private ArrayList<User> members;
}
