package com.employeewage;

public class EmployeeWageApp {

    public static void main(String[] args) {

        EmployeeWageServices service = new EmployeeWageServices();

        int empType = (int)(Math.random()*3);

        int hours = service.getWorkingHours(empType);

        int wage = hours * EmployeeWageServices.WAGE_PER_HOUR;

        System.out.println("Employee Hours : " + hours);
        System.out.println("Daily Wage : " + wage);

    }
}