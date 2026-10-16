import java.util.Scanner;

public class ATMpin {
    public static void main() {
        Scanner Atm = new Scanner(System.in);
        int n = 2;
        while (true) {
            System.out.print("Enter PIN: ");
            int pin = Atm.nextInt();
            if (pin == 2009) {
                System.out.print("Access granted!");
                break;
            } else {
                System.out.println("Incorrect PIN");
                System.out.println("Attempts left: "+ n);
                if (n == 0) {
                    System.out.print("Card blocked");
                    break;
                }
                n--;

            }
        }
    }
}
