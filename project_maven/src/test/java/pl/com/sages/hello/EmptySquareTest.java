package pl.com.sages.hello;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class EmptySquareTest {

    @Test
    public void shouldThreeByThreeEmptyMatrix(){
        EmptySquare emptySquare = new EmptySquare(3);
        assertEquals(emptySquare.toString(),"***\n* *\n***\n");
    }
}