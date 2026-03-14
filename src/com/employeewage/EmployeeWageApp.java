package com.employeewage;

public class EmployeeWageApp {

    public static void main(String[] args) {

        EmployeeWageServices service = new EmployeeWageServices();

        service.addCompany(new CompanyEmployee("TCS",20,20,100));
        service.addCompany(new CompanyEmployee("Infosys",25,22,120));

        System.out.println("Companies added successfully");

    }
}