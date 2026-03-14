package com.employeewage;

public class Employee {

    private boolean present;

    public void checkAttendance() {

        int empCheck = (int)(Math.random()*2);

        if(empCheck == 1) {
            present = true;
        }
        else {
            present = false;
        }
    }

    public boolean isPresent() {
        return present;
    }
}