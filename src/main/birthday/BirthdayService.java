package main.birthday;

import java.time.Year;

public class BirthdayService {

    private final IDateTimeService dateTimeService;

    public BirthdayService(IDateTimeService dateTimeService) {
        this.dateTimeService = dateTimeService;
    }

    public int calculateAge(Year yearOfBirth){
        Year currentYear = dateTimeService.getCurrentYear();
        return currentYear.compareTo(yearOfBirth);
    }
}
