package com.employeewage;

import java.util.ArrayList;

public class EmpWageBuilder implements EmpWageInterface {

    // Instance Variables
    private ArrayList<CompanyEmpWage> companies;

    public EmpWageBuilder() {
        companies = new ArrayList<>();
    }

    // Method to add company
    @Override
    public void addCompany(String companyName, int wagePerHour, int maxDays, int maxHours) {
        companies.add(new CompanyEmpWage(companyName, wagePerHour, maxDays, maxHours));
    }

    // Method to compute wage for all companies
    @Override
    public void computeEmployeeWage() {
        for (CompanyEmpWage company : companies) {
            System.out.println("\nCompany: " + company.getCompanyName());
            company.computeEmployeeWage();
        }
    }

    // Method to get total wage by company name
    @Override
    public int getTotalWage(String companyName) {
        for (CompanyEmpWage company : companies) {
            if (company.getCompanyName().equals(companyName)) {
                return company.getTotalWage();
            }
        }
        return 0;
    }
}