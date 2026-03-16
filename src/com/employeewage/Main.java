package com.employeewage;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC8 - Compute Employee Wage for multiple companies
        System.out.println("Company: TCS");
        EmployeeWage.computeEmployeeWage(20, 20, 100);

        System.out.println("\nCompany: Infosys");
        EmployeeWage.computeEmployeeWage(25, 22, 120);

    }
}