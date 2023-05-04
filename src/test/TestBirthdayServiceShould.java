package test;

import main.BirthdayService;
import main.DateTimeService;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestBirthdayServiceShould {
    @Test
    public void calculate_age___with_problems(){
        DateTimeService dateTimeService = new DateTimeService();
        BirthdayService birthdayService = new BirthdayService(dateTimeService);

        int age = birthdayService.calculateAge(Year.parse("1989"));
        assertEquals(34, age);
    }

    @Test
    public void calculate_age___with_mocks(){
    }
}
