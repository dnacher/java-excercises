package excercises.chocolateFeast;

import java.util.ArrayList;
import java.util.List;

/**
 * Daniel Nacher
 * 2024-06-05
 *
 * Little Bobby loves chocolate. He frequently goes to his favorite  store, Penny Auntie, to buy them. They are having
 * a promotion at Penny Auntie. If Bobby saves enough wrappers, he can turn them in for a free chocolate.
 *
 * Example
 * n = 15
 * c = 3
 * m = 12
 * He has 15 to spend, bars cost 3, and he can turn in 2 wrappers to receive another bar. Initially, he buys 5 bars and
 * has 5 wrappers after eating them. He turns in 4 of them, leaving him with 1, for 2 more bars. After eating those two,
 * he has 3 wrappers, turns in 2 leaving him with 1 wrapper and his new bar. Once he eats that one, he has 2 wrappers
 * and turns them in for another bar. After eating that one, he only has 1 wrapper, and his feast ends. Overall,
 * he has eaten 5 + 2 + 1 + 1 = 9 bars.
 */
public class ChocolateFeast {

    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here
        Integer money = n;
        Integer costOfChocolate = c;
        Integer numOfWrapperNeeded = m;

        Integer totalChocolates = buyChocolate(money,costOfChocolate);
        Integer wrappers = totalChocolates;
        while(wrappers >= numOfWrapperNeeded) {
            List<Integer> list = getPromo(wrappers, numOfWrapperNeeded, totalChocolates);
            totalChocolates = list.get(0);
            wrappers = list.get(1);
        }

        return totalChocolates;
    }

    private static int buyChocolate(int money, int costOfChocolate) {
        return money/costOfChocolate;
    }

    private static List<Integer> getPromo(Integer numChocolateWrapper, Integer wrapperNeeded, Integer totalChocolates) {
        int chocolateGain = numChocolateWrapper / wrapperNeeded;
        List<Integer> list = new ArrayList<>();
        totalChocolates += chocolateGain;
        numChocolateWrapper -= chocolateGain * wrapperNeeded;
        numChocolateWrapper += chocolateGain;
        list.add(totalChocolates);
        list.add(numChocolateWrapper);
        return list;
    }
}
