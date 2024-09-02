package srp.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import srp.model.User;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class UserServiceTest {

    private UserService userService;
    private EmailService emailService;

    @BeforeEach
    void setUp() {
        emailService = Mockito.mock(EmailService.class);
        userService = new UserService(emailService);
    }

    @Test
    void shouldRegisterUserAndSendWelcomeEmail() {
        User user = new User("John Doe", "john.doe@example.com");

        userService.registerUser(user);

        // Verify that the email service sends a welcome email
        verify(emailService, times(1)).sendWelcomeEmail(any(User.class));
    }
}
