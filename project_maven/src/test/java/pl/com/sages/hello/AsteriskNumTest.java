package pl.com.sages.hello;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class AsteriskNumTest {

    @Test
    public void shouldReturnAsteriskSquare(){
            AsteriskNum letter = new AsteriskNum(5,'A');
            assertEquals(letter.toString(),"*****\n*****\n*****\n*****\n*****\n");
        }


    @Test
    public void shouldReturnZero(){
        AsteriskNum zero = new AsteriskNum(5,'0');
        assertEquals(zero.toString(),"*****\n*   *\n*   *\n*   *\n*****\n");
    }

    @Test
    public void shouldReturnOne(){
        AsteriskNum one = new AsteriskNum(5,'1');
        assertEquals(one.toString(),"    *\n    *\n    *\n    *\n    *\n");
    }

    @Test
    public void shouldReturnTwo(){
        AsteriskNum one = new AsteriskNum(5,'2');
        assertEquals(one.toString(),"*****\n    *\n*****\n*    \n*****\n");
    }

    @Test
    public void shouldReturnFour(){
        AsteriskNum four = new AsteriskNum(5,'4');
        assertEquals(four.toString(),"*   *\n*   *\n*****\n    *\n    *\n");
    }
}
