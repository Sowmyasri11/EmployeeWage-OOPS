package com.employeewage;

public class EmployeeWageServices {

    public static final int WAGE_PER_HOUR = 20;

    public int getWorkingHours(int empType) {

        int hours = 0;

        if(empType == 1)
            hours = 4;   // Part Time

        else if(empType == 2)
            hours = 8;   // Full Time

        return hours;
    }

}