package srp.service;

import org.junit.jupiter.api.Test;
import srp.model.User;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class EmailServiceTest {

    private final EmailService emailService = new EmailService();

    @Test
    void shouldSendWelcomeEmailWithoutExceptions() {
        User user = new User("Jane Doe", "jane.doe@example.com");

        assertDoesNotThrow(() -> emailService.sendWelcomeEmail(user));
    }
}
