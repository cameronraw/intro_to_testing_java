package main;

import java.time.Year;

public class DateTimeService implements IDateTimeService {
    public Year getCurrentYear() {
        return Year.now();
    }
}
