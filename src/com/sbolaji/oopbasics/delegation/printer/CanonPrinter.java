package com.sbolaji.oopbasics.delegation.printer;

import java.util.logging.Logger;

public class CanonPrinter implements Printer{

    public void print(String message) {
        System.out.println(message + " from cannon");
    }

}
