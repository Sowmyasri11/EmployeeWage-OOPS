package com.employeewage;

public class CompanyEmployee {

    String companyName;
    int wagePerHour;
    int maxDays;
    int maxHours;

    public CompanyEmployee(String companyName,
                           int wagePerHour,
                           int maxDays,
                           int maxHours){

        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxDays = maxDays;
        this.maxHours = maxHours;
    }
}