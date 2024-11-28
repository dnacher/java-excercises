package excercises.sherlockAndSquares;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-05
 */
public class SherlockAndSquaresTest {

    @Test
    public void test() {
        System.out.print("Test 01 time: ");
        assertEquals(2, SherlockAndSquares.squares(3, 9));
    }

    @Test
    public void test2() {
        System.out.print("Test 02 time: ");
        assertEquals(0, SherlockAndSquares.squares(17, 24));
    }

    @Test
    public void test3() {
        System.out.print("Test 03 time: ");
        assertEquals(3, SherlockAndSquares.squares(35, 70));
    }

    @Test
    public void test4() {
        System.out.print("Test 04 time: ");
        assertEquals(22, SherlockAndSquares.squares(100, 1000));
    }

    @Test
    public void test5() {
        System.out.print("Test 05 time: ");
        assertEquals(2, SherlockAndSquares.squaresV2(3, 9));
    }

    @Test
    public void test6() {
        System.out.print("Test 06 time: ");
        assertEquals(0, SherlockAndSquares.squaresV2(17, 24));
    }

    @Test
    public void test7() {
        System.out.print("Test 07 time: ");
        assertEquals(3, SherlockAndSquares.squaresV2(35, 70));
    }

    @Test
    public void test8() {
        System.out.print("Test 08 time: ");
        assertEquals(22, SherlockAndSquares.squaresV2(100, 1000));
    }

    @Test
    public void Test9() {
        System.out.print("Test 09 time: ");
        assertEquals(9855, SherlockAndSquares.squaresV2(465868129, 988379794));
    }

    @Test
    public void Test10() {
        System.out.print("Test 10 time: ");
        assertEquals(9855, SherlockAndSquares.squares(465868129, 988379794));
    }

}
