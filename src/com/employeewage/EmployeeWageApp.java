package com.employeewage;

public class EmployeeWageApp {

    public static void main(String[] args) {

        EmployeeWageServices service = new EmployeeWageServices();

        int wage = service.computeEmployeeWage(20,20,100);

        System.out.println("Employee Wage : " + wage);

    }
}