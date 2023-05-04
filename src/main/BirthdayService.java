package main;

import java.time.Year;

public class BirthdayService {

    private DateTimeService dateTimeService;

    public BirthdayService(DateTimeService dateTimeService) {
        this.dateTimeService = dateTimeService;
    }

    public int calculateAge(Year yearOfBirth){
        Year currentYear = dateTimeService.getCurrentYear();
        return currentYear.compareTo(yearOfBirth);
    }
}
