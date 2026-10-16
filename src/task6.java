import java.util.Scanner;

public class task6 {
    public static void main() {
        System.out.println("EX: 6");
        System.out.println("WHILE");
        Scanner gh = new Scanner(System.in);
        int z = gh.nextInt();
        int x = 1;
        while(x<=z) {
            System.out.println(x);
            x += 2;

        }
        System.out.println("FOR");
        for(x=1; x<=z; x+=2){
            System.out.println(x);
        }
        System.out.println("DO-WHILE");
        x=1;

        if (z>=2) {
            do {
                System.out.println(x);
                x += 2;
            } while (x <= z);
        }


    }
}
