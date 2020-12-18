/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POS;

/**
 *
 * @author Madhushan Udeshike
 */
public class POS {

    public static void main(String[] args) {
        PrinterService printerService = new PrinterService();

//        System.out.println(printerService.getPrinters());
        
        String printName = "EPSON TM-U220 Receipt";
        for (int i = 0; i < 1; i++) {
            printerService.printString(printName, "\n Test Line " + i);
        }

        byte[] cutP = new byte[]{0x1d, 'V', 1};
        printerService.printBytes("EPSON TM-U220 Receipt", cutP);
    }

}
