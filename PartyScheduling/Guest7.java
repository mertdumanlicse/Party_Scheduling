package PartyScheduling;

import java.util.Random;
import static PartyScheduling.PartyScheduling.min0;
import static PartyScheduling.PartyScheduling.min1;
import static PartyScheduling.PartyScheduling.min2;
import static PartyScheduling.PartyScheduling.trays;

public class Guest7 implements Runnable {

    Table q;

    public Guest7(Table q) {
        this.q = q;
        Thread t7 = new Thread(this, "Guest7");
        t7.start();
    }

    public void run() {
        while (true) {
            Random rand = new Random();
            int x = rand.nextInt(3);
            int y = rand.nextInt(100) + 1000;
            int z = rand.nextInt(500);
            try {
                Thread.sleep(z);
            } catch (Exception e) {
            }
            if (x == 0 && min0[7] < 5) {
                if (30 - q.sum(min0) > q.zeros(min0) || min0[7] == 0) {
                    if (trays[0] > 0) {
                        q.get(0);
                        System.out.println("Guest7 took a borek.");
                        min0[7] = min0[7] + 1;
                        try {
                            Thread.sleep(y);
                        } catch (Exception e) {
                        }
                    }
                    if (trays[0] == 0) {
                        try {
                            Thread.sleep(y);
                        } catch (Exception e) {
                        }
                    }
                }
            }
            if (x == 1 && min1[7] < 2) {
                if (15 - q.sum(min1) > q.zeros(min1) || min1[7] == 0) {
                    if (trays[1] > 0) {
                        q.get(1);
                        System.out.println("Guest7 took a slice of cake.");
                        min1[7] = min1[7] + 1;
                        try {
                            Thread.sleep(y);
                        } catch (Exception e) {
                        }
                    }
                    if (trays[1] == 0) {
                        try {
                            Thread.sleep(y);
                        } catch (Exception e) {
                        }
                    }
                }
            }
            if (x == 2 && min2[7] < 5) {
                if (30 - q.sum(min2) > q.zeros(min2) || min2[7] == 0) {

                    if (trays[2] > 0) {
                        q.get(2);
                        System.out.println("Guest7 took a glass of drink.");
                        min2[7] = min2[7] + 1;
                        try {
                            Thread.sleep(y);
                        } catch (Exception e) {
                        }
                    }
                    if (trays[2] == 0) {
                        try {
                            Thread.sleep(y);
                        } catch (Exception e) {
                        }
                    }
                }
            }
        }
    }
}
