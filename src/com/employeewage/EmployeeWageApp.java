package com.employeewage;

public class EmployeeWageApp {

    public static void main(String[] args) {

        EmployeeWageServices service = new EmployeeWageServices();

        int wage = service.calculateWageWithCondition();

        System.out.println("Total Wage : " + wage);

    }
}