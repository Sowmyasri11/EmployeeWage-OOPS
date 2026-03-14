package com.employeewage;

public class EmployeeWageApp {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.checkAttendance();

        EmployeeWageServices service = new EmployeeWageServices();

        int wage = service.calculateDailyWage(emp.isPresent());

        System.out.println("Daily Wage : " + wage);
    }
}