package com.sbolaji.oopbasics.employee;

public class Staff {
    public static void main(String[] args) {
        final int fullTimeWorkRate;
        int contractWorkRate;

        NewEmployee contractor, fullTimeEmployee;
        contractor = new Contractor("contractor", 10, 10);
        fullTimeEmployee = new FullTimeEmployee("full time employee", 8);

        System.out.println(contractor.calculateSalary());
        System.out.println(fullTimeEmployee.calculateSalary());
    }
}
