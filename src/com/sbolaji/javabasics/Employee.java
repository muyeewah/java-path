package com.sbolaji.javabasics;

public class Employee {

    int employeeID;
    String employeeName;
    private int employeeAge;

    public Employee(int employeeID, String employeeName, int employeeAge) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }
}
