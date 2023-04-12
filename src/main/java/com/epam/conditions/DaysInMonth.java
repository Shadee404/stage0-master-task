package com.epam.conditions;

import java.time.YearMonth;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month > 12 || month < 1) {
            System.out.println("invalid date");
        } else {
            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();

            if (month == 2 && yearMonth.isLeapYear()) {
                daysInMonth = 29;
            }

            System.out.println(daysInMonth);
        }
    }

}
