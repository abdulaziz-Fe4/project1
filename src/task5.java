import java.util.Scanner;

public class task5 {
    public static void main() {
        System.out.println("EX: 5");
        Scanner gh = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = gh.nextInt();
        System.out.println("WHILE");
        int i = 2;

        while (i <= n) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("DO-WHILE");
        i = 2;

        if (n >= 2) {
            do {
                System.out.println(i);
                i += 2;
            } while (i <= n);
        }

        System.out.println("FOR");

        for (i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}








