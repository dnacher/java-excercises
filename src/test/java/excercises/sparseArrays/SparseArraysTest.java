package excercises.sparseArrays;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-11-07
 */
public class SparseArraysTest {

    @Test
    public void test() {
        assertEquals(SparseArrays.matchingStrings(
                Arrays.asList("aba", "baba", "aba", "xzxb"),
                Arrays.asList("aba", "xzxb", "ab")),
                Arrays.asList(2,1,0));
    }

    @Test
    public void test2() {
        assertEquals(SparseArrays.matchingStrings(
                Arrays.asList("def", "de", "fgh"),
                Arrays.asList("de", "lmn", "fgh")),
                Arrays.asList(1,0,1));
    }

    @Test
    public void test3() {
        assertEquals(SparseArrays.matchingStrings(
                        Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf",
                                "na", "basdn", "sdaklfj", "asdjf"),
                        Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn")),
                Arrays.asList(1, 3, 4, 3, 2));
    }


}
