package ua.od.fabrika.antonichev.HW5;

/**
 * Population of the White Walkers follows
 * further principles:
 * When it is odd, they make a raid to
 * the village to strengthen their army.
 * So it increases by the rule 3*N + 1.
 * When it is even, they try to invade
 * The Seven Kingdoms. And after
 * defeat army is halfed. N / 2.
 * If the only one left, it dies alone!
 * Prove that their army is doomed for any
 * original quantity from 1 to 100.
 */
public class HW5_task0_WhiteWalkers {
    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {

            int attacks = 0;
            int army = n;

            while (army != 1){
                if (army % 2 == 0){
                    attacks++;
                    army /= 2;
                    System.out.println("Army of White Walkers attacks! (" + army + ")");
                }
                else {
                    System.out.println("Army of White Walkers make a raid to the village to strengthen their army (" + army + ")");
                    army = army * 3 + 1;
                }
            }
            System.out.println("Army of White Walkers is defeated in " + attacks + " attacks (" + army + ")");
        }
    }
}
