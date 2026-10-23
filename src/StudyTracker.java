import java.util.Scanner;

public class StudyTracker {
    public static void main(String[] southern) {
        Scanner scanner = new Scanner(System.in);
        final int weeklyGoal = 600;

        int programmingTime = 0;
        int mathematicsTime = 0;
        int englishTime = 0;
        int otherTime = 0;
        int totalStudyTime = 0;
        int totalSessions = 0;

        while (true) {
            System.out.println("\n===== STUDY TRACKER =====");
            System.out.println("1. Add study session");
            System.out.println("2. View statistics");
            System.out.println("3. Check weekly goal");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\nChoose subject:");
                System.out.println("1. Programming");
                System.out.println("2. Mathematics");
                System.out.println("3. English");
                System.out.println("4. Other");
                System.out.print("Choose an option: ");
                int subjectChoice = scanner.nextInt();

                if (subjectChoice < 1 || subjectChoice > 4) {
                    System.out.println("Invalid subject choice. Session not added.");
                    continue;
                }

                System.out.print("Study time in minutes: ");
                int time = scanner.nextInt();

                if (time <= 0) {
                    System.out.println("Invalid study time. Time must be greater than 0.");
                    continue;
                }

                switch (subjectChoice) {
                    case 1: programmingTime += time; break;
                    case 2: mathematicsTime += time; break;
                    case 3: englishTime += time; break;
                    case 4: otherTime += time; break;
                }

                totalStudyTime += time;
                totalSessions++;
                System.out.println("Study session added!");
                System.out.println("Current total study time: " + totalStudyTime + " minutes");

            } else if (choice == 2) {
                System.out.println("\n===== WEEKLY STATISTICS =====");
                System.out.println("Study sessions: " + totalSessions);
                System.out.println("Total study time: " + totalStudyTime + " minutes");
                System.out.println("Programming: " + programmingTime + " minutes");
                System.out.println("Mathematics: " + mathematicsTime + " minutes");
                System.out.println("English: " + englishTime + " minutes");
                System.out.println("Other: " + otherTime + " minutes");

            } else if (choice == 3) {
                System.out.println("\nWeekly goal: " + weeklyGoal + " minutes");
                System.out.println("You studied: " + totalStudyTime + " minutes");

                if (totalStudyTime >= weeklyGoal) {
                    System.out.println("Weekly goal achieved!");
                } else {
                    int remaining = weeklyGoal - totalStudyTime;
                    System.out.println("Remaining: " + remaining + " minutes");
                }

            } else if (choice == 4) {
                System.out.println("\nStudy tracker closed. Keep up the good work!");
                break;
            } else {
                System.out.println("Invalid menu choice. Please select 1-4.");
            }
        }
        scanner.close();
    }
}
