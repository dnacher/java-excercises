package excercises.ACM_ICPC_Team;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-07-17
 */
public class ACM_ICPC_TeamTest {

    @Test
    public void test() {
        assertEquals(Arrays.asList(5,2), ACM_ICPC_Team.acmTeam(Arrays.asList(
                "10101",
                "11100",
                "11010",
                "00101")));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(5,6), ACM_ICPC_Team.acmTeam(Arrays.asList(
                "11101",
                "10101",
                "11001",
                "10111",
                "10000",
                "01110"
        )));
    }

    @Test
    public void test3() {
        ACM_ICPC_Team.getSmallestAndLargest("welcometojava", 3);
    }



}
