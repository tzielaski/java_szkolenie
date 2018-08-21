package pl.com.sages.hello;

public class LaserPrinter implements PrinterInterface, FastPrintingInterface {

    private String name;


    LaserPrinter(String name){
        this.name=name;
    }

    @Override
    public void print(String text) {
        System.out.println("Laser: " + text);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print(String text, int numberOfCopies) {
        for(int i=0;i<numberOfCopies;i++){
            System.out.println("Laser: " + text.toUpperCase());
        }
    }
}
