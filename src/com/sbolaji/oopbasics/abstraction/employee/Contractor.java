package com.sbolaji.oopbasics.abstraction.employee;

public class Contractor extends NewEmployee {

    private int workingHours;

    public Contractor(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * (workingHours);
    }

}
