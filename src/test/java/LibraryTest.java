import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book();
    }

    @Test
    public void libraryHasNoBooks() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void libraryHasBooks() {
        library.getAddBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void libraryHasTooManyBooks() {
        library.getAddBook(book);
        library.getAddBook(book);
        library.getAddBook(book);
        library.getAddBook(book);
        library.getAddBook(book);
        library.getAddBook(book);
        assertEquals(5, library.getBookCount());
    }

}
