package excercises.queensAttackII;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Daniel Nacher
 * 2024-07-15
 */
public class QueensAttackIITest {

    @Test
    public void test() {
        QueensAttackII.queensAttack(5, 3, 4, 3, Arrays.asList(
                Arrays.asList(5,5),
                Arrays.asList(4,2),
                Arrays.asList(2,3)
        ));
    }

    @Test
    public void test2() {
        QueensAttackII.queensAttack(4, 0, 4, 4, new ArrayList<>());
    }

    @Test
    public void test3() {
        QueensAttackII.queensAttack(1, 0, 1, 1, new ArrayList<>());
    }
}
