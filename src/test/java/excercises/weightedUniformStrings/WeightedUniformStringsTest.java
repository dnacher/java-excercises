package excercises.weightedUniformStrings;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Daniel Nacher
 * 2023-03-25
 */
public class WeightedUniformStringsTest {

    @Test
    public void testWeightedUniformStrings() {
        String s = "abccddde";
        List<Integer> queries = Arrays.asList(1, 3, 12, 5, 9);
        List<String> expected = Arrays.asList("Yes", "Yes", "Yes", "Yes", "No");

        List<String> actual = WeightedUniformStrings.weightedUniformStrings(s, queries);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWeightedUniformStrings2() {
        String s = "aaabbbbcccddd";
        List<Integer> queries = Arrays.asList(5,9,7,8,12,5);
        List<String> expected = Arrays.asList("No", "Yes", "No", "Yes", "Yes", "No");

        List<String> actual = WeightedUniformStrings.weightedUniformStrings(s, queries);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWeightedUniformStrings3() {
        String s = "abccddde";
        List<Integer> queries = Arrays.asList(6, 1, 3, 12, 5, 9, 10);
        List<String> expected = Arrays.asList("Yes", "Yes", "Yes", "Yes","Yes", "No", "No");

        List<String> actual = WeightedUniformStrings.weightedUniformStrings(s, queries);

        Assertions.assertEquals(expected, actual);
    }

}
