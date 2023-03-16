package excercises.caesarCipher;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2023-03-15
 */
public class CaesarCipherTest {

    @Test
    public void testCaesarCipher() {
        String input = "middle-Outz";
        int k = 2;
        String expectedOutput = "okffng-Qwvb";
        String actualOutput = CaesarCipher.caesarCipher(input, k);
        assertEquals(expectedOutput, actualOutput);

        input = "Always-Look-on-the-Bright-Side-of-Life";
        k = 5;
        expectedOutput = "Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj";
        actualOutput = CaesarCipher.caesarCipher(input, k);
        assertEquals(expectedOutput, actualOutput);

        input = "Hello_World!";
        k = 4;
        expectedOutput = "Lipps_Asvph!";
        actualOutput = CaesarCipher.caesarCipher(input, k);
        assertEquals(expectedOutput, actualOutput);

        input = "1X7T4VrCs23k4vv08D6yQ3S19G4rVP188M9ahuxB6j1tMGZs1m10ey7eUj62WV2exLT4C83zl7Q80M";
        k = 27;
        expectedOutput = "1Y7U4WsDt23l4ww08E6zR3T19H4sWQ188N9bivyC6k1uNHAt1n10fz7fVk62XW2fyMU4D83am7R80N";
        actualOutput = CaesarCipher.caesarCipher(input, k);
        assertEquals(expectedOutput, actualOutput);
    }
}
