package pl.com.sages.hello;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class AsteriskSquareTest {


    @Test
    public void shouldReturnTwoByTwoAsteriskMatrix(){
        AsteriskSquare asteriskSquare = new AsteriskSquare(2);
        assertEquals(asteriskSquare.toString(),"**\n**\n");
    }
}
