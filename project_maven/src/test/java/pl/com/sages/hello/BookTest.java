package pl.com.sages.hello;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void sumPageCount() {
        Book[] books = {new Book("The Beauty and the Beast",256),
                new Book("Infinity",100),
                new Book("Infiltration",300)};
        assertEquals(Book.sumPageCount(books),656);
    }

    @Test
    public void getLongestBook() {
        Book longestBook = new Book("Infiltration",300);
        Book[] books = {new Book("The Beauty and the Beast",256),
                new Book("Infinity",100),
                longestBook};

        assertEquals(Book.getLongestBook(books),longestBook);
    }
}