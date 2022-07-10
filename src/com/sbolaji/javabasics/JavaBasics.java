package com.sbolaji.javabasics;

import java.text.MessageFormat;

public class JavaBasics {
    public static void main(String[] args) {

        Employee employee;
        employee = new Employee(10, "Cryuff", 25);

//        System.out.println(MessageFormat.format("Employee's age is", employee.getEmployeeAge()));
        employee.setEmployeeAge(44);
        System.out.println("Employee's age is: " + employee.employeeID);

//        int startingNumber = 12;
//        int endingNumber = 9;
//
//        int sumOfNumbers = 0;
//        for (int number = startingNumber; number >= endingNumber; number-=2) {
//            System.out.println("number: " + number);
//            sumOfNumbers += number;
//
//            if (sumOfNumbers >= 12) break;
//        }
//        System.out.println("Sum of numbers is: " + sumOfNumbers);

    }
}
