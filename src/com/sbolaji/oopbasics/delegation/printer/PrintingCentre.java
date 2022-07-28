package com.sbolaji.oopbasics.delegation.printer;

public class PrintingCentre {

    public static final String MESSAGE_TO_PRINT = "Hello, World!";

    public static void main(String[] args) {
        PrinterController hpPrinterController = new PrinterController(new HpPrinter());
        PrinterController epsonPrinterController = new PrinterController(new EpsonPrinter());
        PrinterController cannonPrinterController = new PrinterController(new CanonPrinter());

        cannonPrinterController.print(MESSAGE_TO_PRINT);
    }
}
