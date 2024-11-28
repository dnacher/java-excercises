package excercises.serviceLane;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-07
 */
public class ServiceLaneTest {

    @Test
    public void test() {
        assertEquals(Arrays.asList(1, 2, 3, 2, 1), ServiceLane.serviceLane(Arrays.asList(
                                                                            Arrays.asList(0,3),
                                                                            Arrays.asList(4, 6),
                                                                            Arrays.asList(6, 7),
                                                                            Arrays.asList(3, 5),
                                                                            Arrays.asList(0, 7)),
                                                                            Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3)));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(2, 1, 1, 1, 2), ServiceLane.serviceLane(Arrays.asList(
                                                                            Arrays.asList(2,3),
                                                                            Arrays.asList(1, 4),
                                                                            Arrays.asList(2, 4),
                                                                            Arrays.asList(2, 4),
                                                                            Arrays.asList(2, 3)),
                                                                            Arrays.asList(1, 2, 2, 2, 1)));
    }
}
