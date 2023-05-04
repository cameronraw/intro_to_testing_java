package main.birthday;

import java.time.Year;

public class RealDateTimeService implements IDateTimeService {
    public Year getCurrentYear() {
        return Year.now();
    }
}
