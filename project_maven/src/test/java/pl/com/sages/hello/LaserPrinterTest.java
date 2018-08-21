package pl.com.sages.hello;

import org.junit.Test;

import static org.junit.Assert.*;

public class LaserPrinterTest {

    @Test(expected = OutOfPaperException.class)
    public void shouldThrowOutOfPaperException() {
        LaserPrinter laserPrinter = new LaserPrinter("Test Laser Printer");
        laserPrinter.print("A",11);

    }
}