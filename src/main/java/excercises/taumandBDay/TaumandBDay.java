package excercises.taumandBDay;

/**
 * Daniel Nacher
 * 2024-07-22
 *
 * Taum is planning to celebrate the birthday of his friend, Diksha. There are two types of gifts that Diksha wants from
 * Taum: one is black and the other is white. To make her happy, Taum has to buy b black gifts and w white gifts.
 *
 * The cost of each black gift is bc units.
 * The cost of every white gift is wc units.
 * The cost to convert a black gift into white gift or vice versa is z units.
 * Determine the minimum cost of Diksha's gifts.
 *
 * Example :
 * b= 3
 * w= 5
 * bc = 4
 * wc = 4
 * z = 1
 * He can buy a black gift for 3 and convert it to a white gift for 1, making the total cost of each white gift 4.
 * That matches the cost of a white gift, so he can do that or just buy black gifts and white gifts. Either way,
 * the overall cost is 3*3 + 5*4 = 29.
 */
public class TaumandBDay {


    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        if((bc+z)<wc) {
            wc = bc + z;
        }
        if((wc+z)<bc) {
            bc = wc + z;
        }
        long btotal = Long.valueOf(b) * Long.valueOf(bc);
        long wtotal = Long.valueOf(w) * Long.valueOf(wc);
        Long l = Long.valueOf(btotal + wtotal);
        return l;
    }
}
