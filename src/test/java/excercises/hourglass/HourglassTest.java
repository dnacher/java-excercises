package excercises.hourglass;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;


/**
 * Daniel Nacher
 * 2024-07-30
 */
public class HourglassTest {

    @Test
    public void test() {
        List<Integer> list1 = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> list2 = Arrays.asList(0, 1, 0, 0, 0, 0);
        List<Integer> list3 = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> list4 = Arrays.asList(0, 0, 2, 4, 4, 0);
        List<Integer> list5 = Arrays.asList(0, 0, 0, 2, 0, 0);
        List<Integer> list6 = Arrays.asList(0, 0, 1, 2, 4, 0);
        int total = Hourglass.hourglass(Arrays.asList(list1,list2,list3,list4, list5, list6));
        System.out.println(total);
    }

    @Test
    public void test2() {
        List<Integer> list1 = Arrays.asList(-1, -1, 0, -9, -2, -2);
        List<Integer> list2 = Arrays.asList(-2, -1, -6, -8, -2, -5);
        List<Integer> list3 = Arrays.asList(-1, -1, -1, -2, -3, -4);
        List<Integer> list4 = Arrays.asList(-1, -9, -2, -4, -4, -5);
        List<Integer> list5 = Arrays.asList(-7, -3, -3, -2, -9, -9);
        List<Integer> list6 = Arrays.asList(-1, -3, -1, -2, -4, -5);
        int total = Hourglass.hourglass(Arrays.asList(list1,list2,list3,list4, list5, list6));
        System.out.println(total);
    }








}
