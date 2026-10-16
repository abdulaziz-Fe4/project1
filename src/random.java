import java.util.Random;
import java.util.Scanner;

public class random {
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static void main(){
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        Scanner guess = new Scanner(System.in);
        int attempts = 4;
        while(true){
            System.out.print("Guess the number: ");
            int num = guess.nextInt();
            if (num==randomNumber ){
                System.out.print(GREEN+"You guess the number\uD83C\uDF89!!!");
                break;
        }

            else {
                if (num > randomNumber) {
                    System.out.println("Too high");
                    System.out.println(attempts + " attempts");
                } else {
                    System.out.println("Too low");
                    System.out.println(attempts + " attempts");


            }
                if (attempts==0){
                    System.out.println("Game over");
                    System.out.println("The secret number was "+GREEN+ randomNumber);
                    break;
                }
                attempts--;
        }
        }

    }
}
