package com.employeewage;

public class EmpWageBuilder implements EmpWageInterface {

    // Instance Variables
    private CompanyEmpWage[] companies;
    private int numOfCompanies;

    public EmpWageBuilder() {
        companies = new CompanyEmpWage[10]; // Assume max 10 companies
        numOfCompanies = 0;
    }

    // Method to add company
    @Override
    public void addCompany(String companyName, int wagePerHour, int maxDays, int maxHours) {
        companies[numOfCompanies] = new CompanyEmpWage(companyName, wagePerHour, maxDays, maxHours);
        numOfCompanies++;
    }

    // Method to compute wage for all companies
    @Override
    public void computeEmployeeWage() {
        for (int i = 0; i < numOfCompanies; i++) {
            System.out.println("\nCompany: " + companies[i].getCompanyName());
            companies[i].computeEmployeeWage();
        }
    }

    // Method to get total wage by company name
    @Override
    public int getTotalWage(String companyName) {
        for (int i = 0; i < numOfCompanies; i++) {
            if (companies[i].getCompanyName().equals(companyName)) {
                return companies[i].getTotalWage();
            }
        }
        return 0;
    }
}