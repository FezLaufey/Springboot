package com.example.demo;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MessageController {
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/message")
    public String displayMessage(Model model) {
        // Fetch the message from the database
        String message = messageRepository.findById(1).orElseThrow().getText();
        model.addAttribute("message", message);
        return "hello";
    }
}
