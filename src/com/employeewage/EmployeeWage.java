package com.employeewage;

public class EmployeeWage {

    // Class Variables
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 4;
    public static final int MAX_HOURS = 100;
    public static final int MAX_DAYS = 20;

    // Class Method to Compute Employee Wage
    public static int computeEmployeeWage() {
        int totalWage = 0;
        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < MAX_HOURS && totalDays < MAX_DAYS) {
            totalDays++;
            int empCheck = (int)(Math.random() * 2); // 0 or 1

            if (empCheck == 1) {
                System.out.println("Day " + totalDays + ": Employee is Present");
                int empType = (int)(Math.random() * 2); // 0 - Part Time, 1 - Full Time
                int hours = 0;
                switch (empType) {
                    case 0:
                        hours = PART_TIME_HOURS;
                        break;
                    case 1:
                        hours = FULL_DAY_HOURS;
                        break;
                }
                totalHours += hours;
                int dailyWage = WAGE_PER_HOUR * hours;
                totalWage += dailyWage;
                System.out.println("Daily Employee Wage: " + dailyWage);
            } else {
                System.out.println("Day " + totalDays + ": Employee is Absent");
                System.out.println("Daily Employee Wage: 0");
            }
        }

        System.out.println("Total Days: " + totalDays);
        System.out.println("Total Hours: " + totalHours);
        System.out.println("Total Wage: " + totalWage);

        return totalWage;
    }
}