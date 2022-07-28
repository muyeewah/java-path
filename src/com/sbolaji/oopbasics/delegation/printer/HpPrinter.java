package com.sbolaji.oopbasics.delegation.printer;

public class HpPrinter implements Printer{

    public void print(String message) {
        System.out.println(message + " from hp");
    }

}
