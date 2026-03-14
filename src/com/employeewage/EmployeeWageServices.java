package com.employeewage;

public class EmployeeWageServices {

    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;

    public int calculateDailyWage(boolean present) {

        int workHours = 0;

        if(present)
            workHours = FULL_DAY_HOUR;

        return workHours * WAGE_PER_HOUR;
    }
}