package main.birthday;

import java.time.Year;

public class FakeDateTimeService implements IDateTimeService{
    @Override
    public Year getCurrentYear() {
        return Year.parse("2023");
    }
}
