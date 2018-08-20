package pl.com.sages.hello;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void shouldReturnTrueForAdult(){
        Person person = new Person();
        person.age=18;
        assertTrue(person.isAdult());
    }

    @Test
    public void shouldReturnFalseForNotAdult(){
        Person person = new Person();
        person.age=17;
        assertFalse(person.isAdult());
    }

    @Test
    public void manIsRetired(){
        Person person = new Person();
        person.age=65;
        person.setGender("M");
        assertTrue(person.isRetired());
    }
    @Test
    public void manIsNotRetired(){
        Person person = new Person();
        person.age=64;
        person.setGender("M");
        assertFalse(person.isRetired());
    }
    @Test
    public void womanIsRetired(){
        Person person = new Person();
        person.age=60;
        person.setGender("W");
        assertTrue(person.isRetired());
    }
    @Test
    public void womanIsNotRetired(){
        Person person = new Person();
        person.age=59;
        person.setGender("W");
        assertFalse(person.isRetired());
    }
}
