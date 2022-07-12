package com.sbolaji.oopbasics.abstraction.employee;

public class Employees {
    public static void main(String[] args) {

        NewEmployee contractor, fullTimeEmployee;
        contractor = new Contractor("contractor", 10, 10);
        fullTimeEmployee = new FullTimeEmployee("full time employee", 8);

        System.out.println(contractor.calculateSalary());
        System.out.println(fullTimeEmployee.calculateSalary());

    }
}
