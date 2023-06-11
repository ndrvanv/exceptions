package org.example.lections.lectionThree;

import java.io.IOException;
import java.util.Date;

public class SavedException extends IOException {
    private Date startDate;
    public SavedException(String message, Date startDate, Exception e) {
        super("exception with message: "+ message, e);
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }
}
