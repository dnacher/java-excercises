package excercises.libraryFine;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-06
 */
public class LibraryFineTest {

    @Test
    public void test() {
        assertEquals(0, LibraryFine.libraryFine(6, 6 , 2015, 9, 6, 2016));
    }

    @Test
    public void test2() {
        assertEquals(0, LibraryFine.libraryFine(15, 7 , 2014, 1, 7, 2015));
    }

    @Test
    public void test3() {
        assertEquals(10000, LibraryFine.libraryFine(2, 7 , 2015, 1, 2, 2014));
    }

    @Test
    public void test4() {
        assertEquals(45, LibraryFine.libraryFine(9, 6, 2015, 6, 6, 2015));
    }
}
