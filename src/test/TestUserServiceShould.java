package test;

import main.user.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUserServiceShould {
    @Test
    public void greet_user_with_their_name(){
        UserService userService = new UserService();
        String greeting = userService.greetUser("John Lennon");
        assertEquals("Hey, John Lennon!", greeting);
    }

    // Try making a test for some of the other methods!
    // Hint: You can create a Year by using Year.parse("2023)
}
