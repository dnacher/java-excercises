package excercises.jumpingOnTheClouds;

/**
 * Daniel Nacher
 * 2024-06-24
 *
 * A child is playing a cloud hopping game. In this game, there are sequentially numbered clouds that can be thunderheads
 * or cumulus clouds. The character must jump from cloud to cloud until it reaches the start again.
 * There is an array of clouds,  and an energy level e=100. The character starts from c[0] and uses 1 unit of energy to make a jump
 * of size k to cloud c[i+k % n]. If it lands on a thundercloud, c[i]=1, its energy (e) decreases by 2 additional units. The game ends when
 * the character lands back on cloud 0.
 *
 * Given the values of ,n ,k and the configuration of the clouds as an array c, determine the final value of e after the game ends.
 */
public class JumpingOnTheClouds {

    public static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int check = -1;
        while(check!=0) {
            if(check==-1) {
                check = 0;
            }
            check = (check + k) % c.length;
            energy = checkJump(c[check], energy);
        }
        return energy;
    }

    private static int checkJump(int jumpValue, int energy) {
        if(jumpValue==0) {
            energy = cloud(energy);
        } else {
            energy = thunderheads(energy);
        }
        return energy;
    }

    private static  int thunderheads(int energy) {
        return energy-3;
    }

    private static int cloud(int energy) {
        energy--;
        return energy;
    }
}
