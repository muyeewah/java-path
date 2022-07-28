package com.sbolaji.oopbasics.delegation.printer;

public class EpsonPrinter implements Printer{

    public void print(String message) {
        System.out.println(message + " from epson");
    }

}
