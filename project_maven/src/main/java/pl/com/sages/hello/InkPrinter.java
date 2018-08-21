package pl.com.sages.hello;

public class InkPrinter implements PrinterInterface {

    private String name;

    InkPrinter(String name){
        this.name=name;
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public String getName() {
        return name;
    }
}
