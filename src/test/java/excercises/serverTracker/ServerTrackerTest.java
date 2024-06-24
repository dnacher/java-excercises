package excercises.serverTracker;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-14
 *
 * For example:
 *  * const tracker = new Tracker();
 *  * tracker.attach("apibox");
 *  * >> "apibox:1"
 *  * tracker.attach("apibox");
 *  * >> "apibox:2"
 *  * tracker.detach("apibox:1");
 *  * tracker.attach("apibox");
 *  * >> "apibox:1"
 *  * tracker.attach("apibox");
 *  * >> "apibox:3"
 *  * tracker.detach("apibox:2");
 *  * tracker.attach("apibox");
 *  * >> "apibox:2"
 *  * tracker.attach("sitebox");
 *  * >> "sitebox:1"
 *
 */
public class ServerTrackerTest {

    @Test
    public void test() {
        assertEquals("apibox:1", ServerTracker.attach("apibox"));
        assertEquals("apibox:2", ServerTracker.attach("apibox"));
        ServerTracker.detach("apibox:1");
        assertEquals("apibox:1", ServerTracker.attach("apibox"));
        assertEquals("apibox:3", ServerTracker.attach("apibox"));
        ServerTracker.detach("apibox:2");
        assertEquals("apibox:2", ServerTracker.attach("apibox"));
        assertEquals("sitebox:1", ServerTracker.attach("sitebox"));
    }
}
