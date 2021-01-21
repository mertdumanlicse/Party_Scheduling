package PartyScheduling;

import java.util.Random;
import static PartyScheduling.PartyScheduling.min0;
import static PartyScheduling.PartyScheduling.min1;
import static PartyScheduling.PartyScheduling.min2;
import static PartyScheduling.PartyScheduling.trays;

public class Guest2 implements Runnable {

    Table q;

    public Guest2(Table q) {
        this.q = q;
        Thread t2 = new Thread(this, "Guest2");
        t2.start();
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
            if (x == 0 && min0[2] < 5) {
                if (30 - q.sum(min0) > q.zeros(min0) || min0[2] == 0) {
                    if (trays[0] > 0) {
                        q.get(0);
                        System.out.println("Guest2 took a borek.");
                        min0[2] = min0[2] + 1;
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
            if (x == 1 && min1[2] < 2) {
                if (15 - q.sum(min1) > q.zeros(min1) || min1[2] == 0) {
                    if (trays[1] > 0) {
                        q.get(1);
                        System.out.println("Guest2 took a slice of cake.");
                        min1[2] = min1[2] + 1;
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
            if (x == 2 && min2[2] < 5) {
                if (30 - q.sum(min2) > q.zeros(min2) || min2[2] == 0) {

                    if (trays[2] > 0) {
                        q.get(2);
                        System.out.println("Guest2 took a glass of drink.");
                        min2[2] = min2[2] + 1;
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
