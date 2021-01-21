package PartyScheduling;

import static PartyScheduling.PartyScheduling.total;
import static PartyScheduling.PartyScheduling.trays;

public class Table {

    int num;

    public synchronized void put(int num, int x) {
        this.num = num;
        trays[x] = trays[x] + num;
        total[x] = total[x] - num;
        switch (x) {
            case 0:
                if (num == 1) {
                    System.out.println((char) 27 + "[32m" + "Waiter Put : " + num + " borek" + " on borek tray.");
                } else {
                    System.out.println((char) 27 + "[32m" + "Waiter Put : " + num + " boreks" + " on borek tray.");
                }
                break;
            case 1:
                if (num == 1) {
                    System.out.println((char) 27 + "[31m" + "Waiter Put : " + num + " slice of cake" + " on cake tray.");
                } else {
                    System.out.println((char) 27 + "[31m" + "Waiter Put : " + num + " slices of cake" + " on cake tray.");
                }
                break;
            default:
                if (num == 1) {
                    System.out.println((char) 27 + "[34m" + "Waiter Put : " + num + " glass of drink" + " on drink tray.");
                } else {
                    System.out.println((char) 27 + "[34m" + "Waiter Put : " + num + " glasses of drink" + " on drink tray.");
                }
                break;
        }

    }

    public synchronized void get(int q) {
        trays[q] = trays[q] - 1;
    }

    public synchronized int sum(int[] q) {
        int total = 0;
        for (int a = 0; a < 10; a++) {
            total = total + q[a];
        }
        return total;
    }

    public synchronized int zeros(int[] q) {
        int count = 0;
        for (int a = 0; a < 10; a++) {
            if (q[a] == 0) {
                count = count + 1;
            }
        }
        return count;
    }
}
