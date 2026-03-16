package com.employeewage;

import java.util.ArrayList;

public class CompanyEmpWage {

    // Instance Variables
    private String companyName;
    private int wagePerHour;
    private int maxDays;
    private int maxHours;
    private int totalWage;
    private ArrayList<Integer> dailyWages;

    public CompanyEmpWage(String companyName, int wagePerHour, int maxDays, int maxHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxDays = maxDays;
        this.maxHours = maxHours;
        this.totalWage = 0;
        this.dailyWages = new ArrayList<>();
    }

    // Method to Compute Employee Wage
    public void computeEmployeeWage() {
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < this.maxHours && totalDays < this.maxDays) {
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
                int dailyWage = this.wagePerHour * hours;
                this.totalWage += dailyWage;
                this.dailyWages.add(dailyWage);
                System.out.println("Daily Employee Wage: " + dailyWage);
            } else {
                System.out.println("Day " + totalDays + ": Employee is Absent");
                System.out.println("Daily Employee Wage: 0");
                this.dailyWages.add(0);
            }
        }

        System.out.println("Total Days: " + totalDays);
        System.out.println("Total Hours: " + totalHours);
        System.out.println("Total Wage for " + this.companyName + ": " + this.totalWage);
    }

    // Getter for totalWage
    public int getTotalWage() {
        return totalWage;
    }

    // Getter for companyName
    public String getCompanyName() {
        return companyName;
    }

    // Getter for dailyWages
    public ArrayList<Integer> getDailyWages() {
        return dailyWages;
    }
}