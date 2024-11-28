package excercises.lisasWorkbook;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-10
 */
public class LisasWorkbookTest {

    @Test
    public void test() {
        assertEquals(4, LisasWorkbook.workbook(5, 3, Arrays.asList(4, 2, 6, 1, 10)));
    }

    @Test
    public void test2() {
        assertEquals(8, LisasWorkbook.workbook(10, 5, Arrays.asList(3, 8, 15, 11, 14, 1, 9, 2, 24, 31)));
    }

}
