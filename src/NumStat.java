import java.util.Scanner;

public class NumStat {
    public static void main(String[] args) {
        int numbers = 0;
        int numbers2 = 0;
        int numbers3 = 0;
        int numbers4 = 0;
        int numbers5 = 0;
        Scanner statics = new Scanner(System.in);
        int num1 = 1;
        while (num1<=10) {
            System.out.print("Enter number " + num1 + ": ");
            int num2 = statics.nextInt();



            if(num2>0){
                numbers++;
            }
            else if(num2<0){
                numbers2++;
            }
            else if (num2 == 0){
                numbers3++;
            }
            if(num2 % 2==0){
                numbers4++;
            }
            else {
                numbers5++;
            }


            num1 += 1;
        }

        System.out.println("Positive numbers: " + numbers);
        System.out.println("Negative numbers: " + numbers2);
        System.out.println("Zeros: " + numbers3);
        System.out.println("Even numbers: " + numbers4);
        System.out.println("Odd numbers: " + numbers5);
    }
}

