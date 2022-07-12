package com.sbolaji.oopbasics.abstraction.employee;

public abstract class NewEmployee {

    String name;
    int paymentPerHour;

    public NewEmployee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public abstract int calculateSalary();

}

