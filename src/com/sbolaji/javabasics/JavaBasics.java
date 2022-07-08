package com.sbolaji.javabasics;

import java.text.MessageFormat;

public class JavaBasics {
    public static void main(String[] args) {

        Employee employee;
        employee = new Employee();

        employee.employeeName = "Stanley";
        System.out.println(MessageFormat.format("Employee is {0}", employee.employeeName));

    }
}
