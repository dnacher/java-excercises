package excercises.flippingBits;

/**
 * Daniel Nacher
 * 2024-12-20
 *
 * You will be given a list of 32 bit unsigned integers. Flip all the bits (1 -> 0 and 0 -> 1) and return the result as
 * an unsigned integer.
 *
 * Example
 *
 * n = 9(10)
 * 9(10) = 1001(2)
 *
 * . We're working with 32 bits, so:
 * Return 4.294.967.286.
 *
 * Function Description
 *
 * Complete the flippingBits function in the editor below.
 *
 * flippingBits has the following parameter(s):
 *
 * int n: an integer
 * Returns
 *
 * int: the unsigned decimal integer result
 * Input Format
 *
 * The first line of the input contains , the number of queries.
 * Each of the next q lines contain an integer, n, to process.
 *
 */
public class FlippingBits {

    //4.294.967.295 is the bigger number, if we subtract the biggest number to the input we will have the response
    public static long flippingBits(long n) {
        return 4294967295L - n;
    }

}
