package com.employeewage;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC10 - Ability to manage Employee Wage of multiple companies
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompany("TCS", 20, 20, 100);
        empWageBuilder.addCompany("Infosys", 25, 22, 120);

        empWageBuilder.computeEmployeeWage();

        System.out.println("\nTotal Wage for TCS: " + empWageBuilder.getTotalWage("TCS"));
        System.out.println("Total Wage for Infosys: " + empWageBuilder.getTotalWage("Infosys"));

    }
}