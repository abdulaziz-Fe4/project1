import java.util.Scanner;

public static void main() {
    Scanner mark = new Scanner(System.in);
    System.out.print("Enter your score: ");
    int score = mark.nextInt();
    if (score < 0 || score > 100) {
        System.out.println("You can't get less than 0 or more than 100");
    } else {
        System.out.println(calculateGrade(score));
    }
}



    public static String calculateGrade(int score){
            if (score>=90){
                return "Your score is A";
            }
            else if(score>=80 && score<90){
                return "Your score is B";

            }
            else if(score>=70 && score<80){
                return "Your score is C";
            }
            else if(score>=60 && score<70){
                return "Your score is D";

            }
            else {
                return "Your score is F";
            }
        }

