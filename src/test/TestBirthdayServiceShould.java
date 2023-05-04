package test;

import main.birthday.BirthdayService;
import main.birthday.FakeDateTimeService;
import main.birthday.IDateTimeService;
import main.birthday.RealDateTimeService;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBirthdayServiceShould {
    @Test
    public void calculate_age___with_problems(){
        IDateTimeService dateTimeService = new RealDateTimeService();
        BirthdayService birthdayService = new BirthdayService(dateTimeService);

        int age = birthdayService.calculateAge(Year.parse("1989"));
        assertEquals(34, age);
    }

    @Test
    public void calculate_age___but_better(){
        IDateTimeService fakeDateTimeService = new FakeDateTimeService();
        BirthdayService birthdayService = new BirthdayService(fakeDateTimeService);

        int age = birthdayService.calculateAge(Year.parse("1989"));
        assertEquals(34, age);
    }
}
