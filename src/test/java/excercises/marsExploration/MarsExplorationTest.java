package excercises.marsExploration;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2023-03-14
 */
public class MarsExplorationTest {

    @Test
    public void testMarsExploration() {
        String s1 = "SOSSPSSQSSOR";
        assertEquals(3, MarsExploration.marsExploration(s1));

        String s2 = "SOSSOT";
        assertEquals(1, MarsExploration.marsExploration(s2));

        String s3 = "SOSSOSSOS";
        assertEquals(0, MarsExploration.marsExploration(s3));

        String s4 = "SOSSPSSQSSOR";
        assertEquals(3, MarsExploration.marsExploration(s4));

        //OOS DSS OSO SWE WSO SOS OSO SOS OSS SSO SOS OSS
        // 1    3  3    2  3       3       2    2      2
        String s5 = "OOSDSSOSOSWEWSOSOSOSOSOSOSSSSOSOSOSS";
        assertEquals(20, MarsExploration.marsExploration(s5));

    }
}
