package com.sbolaji.oopbasics.abstraction.employee;

public class FullTimeEmployee extends NewEmployee{

    private final int workingHours = 8;

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }

}
