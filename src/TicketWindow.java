import java.util.ArrayList;
import java.util.Scanner;

public class TicketWindow {
    Scanner sc= new Scanner(System.in);
    int candidate;
    int amount;
    public void book() {
        ArrayList<Integer> age = new ArrayList<Integer>();
        while (true) {
            System.out.println("enter numbers of persons");
            candidate = sc.nextInt();
            for (int i = 1; i <= candidate; i++) {
                System.out.println("enter " + i + "st person age");
                age.add(sc.nextInt());
            }
            for (int i : age) {
                if (i < 3) {
                    amount += 0;
                }
                if (i > 3 && i <= 12) {
                    amount += 100;
                }
                if (i > 12) {
                    amount += 150;
                }
            }
            System.out.println("your bill generated for only " + amount + " rupees, \nVisit Again!");
        }
    }
}
