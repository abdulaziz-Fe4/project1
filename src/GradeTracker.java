import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double assignmentPoints = 0;
        int assignmentCount = 0;
        double examPoints = 0;
        int examCount = 0;

        while (true) {
            System.out.println("\n===== SEMESTER GRADE TRACKER =====");
            System.out.println("1. Add assignment result");
            System.out.println("2. Add exam result");
            System.out.println("3. View current grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter assignment score: ");
                double score = scanner.nextDouble();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Enter a value from 0 to 100.");
                } else {
                    assignmentPoints += score;
                    assignmentCount++;
                    System.out.println("Assignment score added.");
                }

            } else if (choice == 2) {
                System.out.print("Enter exam score: ");
                double score = scanner.nextDouble();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Enter a value from 0 to 100.");
                } else {
                    examPoints += score;
                    examCount++;
                    System.out.println("Exam score added.");
                }

            } else if (choice == 3) {
                if (assignmentCount == 0 && examCount == 0) {
                    System.out.println("\nNo results available yet.");
                    continue;
                }

                System.out.println("\n===== CURRENT RESULTS =====");
                System.out.println("Assignments completed: " + assignmentCount);

                double assignmentAverage = 0;
                if (assignmentCount > 0) {
                    assignmentAverage = assignmentPoints / assignmentCount;
                    System.out.printf("Assignment average: %.1f\n", assignmentAverage);
                } else {
                    System.out.println("Assignment average: N/A");
                }

                System.out.println("Exams completed: " + examCount);
                double examAverage = 0;
                if (examCount > 0) {
                    examAverage = examPoints / examCount;
                    System.out.printf("Exam average: %.1f\n", examAverage);
                } else {
                    System.out.println("Exam average: N/A");
                }

                double overallAverage = 0;
                if (assignmentCount > 0 && examCount > 0) {
                    overallAverage = (assignmentAverage * 0.50) + (examAverage * 0.50);
                    System.out.printf("Overall average (50%% Assignments / 50%% Exams): %.1f\n", overallAverage);
                } else if (assignmentCount > 0) {
                    overallAverage = assignmentAverage;
                    System.out.printf("Overall average (Assignments only): %.1f\n", overallAverage);
                } else {
                    overallAverage = examAverage;
                    System.out.printf("Overall average (Exams only): %.1f\n", overallAverage);
                }

                char grade;
                if (overallAverage >= 90) grade = 'A';
                else if (overallAverage >= 80) grade = 'B';
                else if (overallAverage >= 70) grade = 'C';
                else if (overallAverage >= 60) grade = 'D';
                else grade = 'F';

                System.out.println("Grade: " + grade);
                System.out.println("Status: " + (overallAverage >= 60 ? "Passing" : "Failing"));

            } else if (choice == 4) {
                System.out.println("Grade tracker closed.");
                break;
            } else {
                System.out.println("Invalid option. Choose a value from 1 to 4.");
            }
        }
        scanner.close();
    }
}

