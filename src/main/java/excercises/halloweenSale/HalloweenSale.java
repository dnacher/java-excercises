package excercises.halloweenSale;

/**
 * Daniel Nacher
 * 2024-07-12
 *
 * You wish to buy video games from the famous online video game store Mist.
 *
 * Usually, all games are sold at the same price, p dollars. However, they are planning to have the seasonal Halloween
 * Sale next month in which you can buy games at a cheaper price. Specifically, the first game will cost p dollars, and
 * every subsequent game will cost  dollars less than the previous one. This continues until the cost becomes less than
 * or equal to m dollars, after which every game will cost m dollars. How many games can you buy during the Halloween
 * Sale?
 */
public class HalloweenSale {

    // p = price
    // d = discount
    // m = minimum possible price
    // s = wallet
    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count= 0;
        int totalCost = 0;
        boolean done = false;
        while(!done) {
            totalCost+= p;
            if((p-d) > m) {
                p-= d;
            } else {
                p = m;
            }
            if(s>totalCost) {
                count++;
            } else {
                done = true;
            }
        }
        return count;
    }

    public static int howManyGamesV2(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count= 0;
        int totalCost = 0;
        while (p> m) {
            if(totalCost+p<s) {
                totalCost+= p;
                p-=d;
                count++;
            } else {
                return count;
            }
        }
        s-=totalCost;
        count+= s / m;

        return count;
    }
}
