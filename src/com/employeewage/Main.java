package com.employeewage;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC9 - Ability to save the Total Wage for Each Company
        EmpWageBuilder tcs = new EmpWageBuilder("TCS", 20, 20, 100);
        tcs.computeEmployeeWage();

        EmpWageBuilder infosys = new EmpWageBuilder("Infosys", 25, 22, 120);
        infosys.computeEmployeeWage();

        System.out.println("Total Wage for TCS: " + tcs.getTotalWage());
        System.out.println("Total Wage for Infosys: " + infosys.getTotalWage());

    }
}