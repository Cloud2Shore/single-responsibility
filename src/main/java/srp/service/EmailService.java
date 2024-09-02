package srp.service;

import org.springframework.stereotype.Service;
import srp.model.User;

@Service
public class EmailService {
    public void sendWelcomeEmail(User user) {
        System.out.println("Welcome email sent to: " + user.getEmail());
    }
}
