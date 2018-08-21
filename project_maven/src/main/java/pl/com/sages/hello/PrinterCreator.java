package pl.com.sages.hello;

public class PrinterCreator implements PrinterCreatorInterface {


    @Override
    public PrinterInterface createPrinter(PRINTER_TYPE type) {
        PrinterInterface printer;
        switch (type) {
            case INK:
                printer = new InkPrinter("Ink Printer");
                break;
            case LASER:
                printer = new LaserPrinter("Laser Printer");
                break;
            default:
                printer = new InkPrinter("Dummy printer");
                break;
        }
        return printer;
    }
}
