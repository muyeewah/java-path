package com.sbolaji.javabasics;

import java.text.MessageFormat;

public class ArraysAndCollections {
    public static void main(String[] args) {
//        Employee[] listOfEmployees = new Employee[3];
        Employee firstEmployee, secondEmployee;
        firstEmployee = new Employee(10, "James", 43);
        secondEmployee = new Employee(12, "Jones", 22);
        Employee[] listOfEmployees = {firstEmployee, secondEmployee};
        try {
            System.out.println(MessageFormat.format("2nd employee is: {0}", listOfEmployees[1].getEmployeeName()));
        }
        catch (Exception exceptionMessage) {
            System.out.println(exceptionMessage.getMessage());
        }
    }
}
