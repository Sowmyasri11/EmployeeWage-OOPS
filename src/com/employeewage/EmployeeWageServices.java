package com.employeewage;

public class EmployeeWageServices {

    public static final int WAGE_PER_HOUR = 20;

    public int getWorkingHours(int empType)
    {
        int hours = 0;

        switch(empType)
        {
            case 1:
                hours = 4;
                break;

            case 2:
                hours = 8;
                break;

            default:
                hours = 0;
        }

        return hours;
    }

}