package PartyScheduling;

public class PartyScheduling {

    static int[] trays = {0, 0, 0};
    static int[] total = {30, 15, 30};//total stock
    static int[] min0 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};//Borek counter for each guest
    static int[] min1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};//Cake counter
    static int[] min2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};//Drink counter

    public static void main(String[] args) {
        System.out.println("Welcome to the Organization.");
        Table q = new Table();

        new Waiter(q);
        new Guest0(q);
        new Guest1(q);
        new Guest2(q);
        new Guest4(q);
        new Guest5(q);
        new Guest6(q);
        new Guest7(q);
        new Guest8(q);
        new Guest9(q);
        
        
    }
}
