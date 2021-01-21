package PartyScheduling;

import java.util.Random;
import static PartyScheduling.PartyScheduling.min0;
import static PartyScheduling.PartyScheduling.min1;
import static PartyScheduling.PartyScheduling.min2;
import static PartyScheduling.PartyScheduling.total;
import static PartyScheduling.PartyScheduling.trays;

public class Waiter implements Runnable {

    Table q;

    public Waiter(Table q) {
        this.q = q;
        Thread t = new Thread(this, "Waiter");
        t.start();
    }

    public void run() {
        System.out.println((char) 27 + "[32m" + "*" + "Total number of borek to be served: " + total[0]);
        System.out.println((char) 27 + "[31m" + "*" + "Total number of slices of cake to be served: " + total[1]);
        System.out.println((char) 27 + "[34m" + "*" + "Total number of glasses of drink to be served: " + total[2]);
        while (true) {
            Random rand = new Random();
            int y = rand.nextInt(100) + 1000;
            if (total[0] > 0) {
                if (trays[0] == 0) {
                    if (total[0] >= 5) {
                        q.put(5, 0);
                    } else if (total[0] < 5) {
                        q.put(total[0], 0);
                    }
                } else if (trays[0] == 1) {
                    if (total[0] >= 4) {
                        q.put(4, 0);
                    } else if (total[0] < 4) {
                        q.put(total[0], 0);
                    }

                }
            }
            if (total[1] > 0) {
                if (trays[1] == 0) {
                    if (total[1] >= 5) {
                        q.put(5, 1);
                    } else if (total[1] < 5) {
                        q.put(total[1], 1);
                    }
                } else if (trays[1] == 1) {
                    if (total[1] >= 4) {
                        q.put(4, 1);
                    } else if (total[1] < 4) {
                        q.put(total[1], 1);
                    }

                }
            }
            if (total[2] > 0) {
                if (trays[2] == 0) {
                    if (total[2] >= 5) {
                        q.put(5, 2);
                    } else if (total[2] < 5) {
                        q.put(total[2], 2);
                    }
                } else if (trays[2] == 1) {
                    if (total[2] >= 4) {
                        q.put(4, 2);
                    } else if (total[2] < 4) {
                        q.put(total[2], 2);
                    }

                }
            }
            if (trays[0] > 1 && trays[1] > 1 && trays[2] > 1) {
                try {
                    Thread.sleep(y);
                } catch (Exception e) {
                }
            }
            if (q.sum(min0) == 30 && q.sum(min1) == 15 && q.sum(min2) == 30) {
                System.out.println((char) 27 + "[35m" + "ORGANIZATION HAS BEEN FINISHED");
                int h = 0;
                System.out.println((char) 27 + "[35m" + "Who did that?");
                while (h < 10) {
                    System.out.println((char) 27 + "[35m" + "#" + h + "Guest= Borek: " + min0[h] + " Slices of Cake: " + min1[h] + " Glasses of Drink: " + min2[h]);
                    h++;
                }
                System.out.println("MADE BY\n"+
                        "Mert DUMANLI\t" + "160315002\n" + 
                        "İbrahim Caner KARTAL\t" + "160315007" 
                        );
                System.exit(0);
            }

        }
    }
}
