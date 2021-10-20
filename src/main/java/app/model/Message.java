package app.model;

import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class Message {
    private Long chatId;
    private User sender;
    private String message;
    private Calendar sendTime;
}
