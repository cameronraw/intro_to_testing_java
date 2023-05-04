package test;

import main.UserService;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUserServiceShould {
    @Test
    public void greet_user_with_their_name(){
        UserService userService = new UserService();
        String greeting = userService.greetUser("John Lennon");
        assertEquals("Hey, John Lennon!", greeting);
    }

    @Test
    public void calculate_users_age(){
        UserService userService = new UserService();
        int age = userService.calculateAge(Year.parse("2023"), Year.parse("1989"));
        assertEquals(34, age);
    }
}
