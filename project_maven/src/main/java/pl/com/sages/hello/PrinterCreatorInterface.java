package pl.com.sages.hello;

enum PRINTER_TYPE {INK,LASER}

public interface PrinterCreatorInterface {


        PrinterInterface createPrinter(PRINTER_TYPE type);
}
