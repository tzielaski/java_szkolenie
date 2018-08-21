package pl.com.sages.hello;

public class LaserPrinter implements PrinterInterface, FastPrintingInterface {
    private final int PAPER_CONTAINER_SIZE = 10;

    private String name;
    private int paperSupply;


    LaserPrinter(String name) {
        this.name = name;
        paperSupply = PAPER_CONTAINER_SIZE;
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
    public void print(String text, int numberOfCopies) throws OutOfPaperException {
        for (int i = 0; i < numberOfCopies; i++) {
            if (paperSupply == 0) {
                throw new OutOfPaperException(
                        "This laser printer is out of paper. Please insert new pages into the container"
                );
            }
            System.out.println("Laser: " + text.toUpperCase());
            paperSupply--;
        }
    }

    void refillPaper() {
        paperSupply = 10;
    }
}
