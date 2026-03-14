package com.employeewage;

public class EmployeeWageApp {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.checkAttendance();

        if(emp.isPresent())
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

    }
}