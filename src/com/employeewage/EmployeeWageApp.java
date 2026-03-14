package com.employeewage;

public class EmployeeWageApp {

    public static void main(String[] args) {

        EmployeeWageServices service = new EmployeeWageServices();

        int wage = service.calculateMonthlyWage();

        System.out.println("Monthly Wage : " + wage);

    }
}