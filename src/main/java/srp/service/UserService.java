package srp.service;

import org.springframework.stereotype.Service;
import srp.model.User;

@Service
public class UserService {

    private final EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(User user) {
        // Save user to the database
        System.out.println("User saved: " + user.getName());

        // Send welcome email
        emailService.sendWelcomeEmail(user);
    }
}
