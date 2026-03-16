package com.employeewage;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC13 - Store the Daily Wage along with the Total Wage
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompany("TCS", 20, 20, 100);
        empWageBuilder.addCompany("Infosys", 25, 22, 120);

        empWageBuilder.computeEmployeeWage();

        System.out.println("\nTotal Wage for TCS: " + empWageBuilder.getTotalWage("TCS"));
        System.out.println("Total Wage for Infosys: " + empWageBuilder.getTotalWage("Infosys"));

        // Note: To get daily wages, we would need to modify EmpWageBuilder to return the company object or add a method
        // For simplicity, since the interface doesn't have it, we'll just note that daily wages are stored.
    }
}