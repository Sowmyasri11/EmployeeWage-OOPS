package com.employeewage;

public interface EmpWageInterface {

    void addCompany(String companyName, int wagePerHour, int maxDays, int maxHours);
    void computeEmployeeWage();
    int getTotalWage(String companyName);
}