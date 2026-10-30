import java.util.Scanner;

public class numberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Choose the pattern type:");
        System.out.println("1 - Right Triangle");
        System.out.println("2 - Inverted Right Triangle");
        System.out.println("3 - Pyramid");
        System.out.println("4 - Inverted Pyramid");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        System.out.println();
        System.out.println("Size: " + rows);

        if (choice == 1) {
            System.out.println("Pattern: Right Triangle");
            drawRightTriangle(rows);
        }
        else if (choice == 2) {
            System.out.println("Pattern: Inverted Right Triangle");
            drawInvertedRightTriangle(rows);
        }
        else if (choice == 3) {
            System.out.println("Pattern: Pyramid");
            drawPyramid(rows);
        }
        else if (choice == 4) {
            System.out.println("Pattern: Inverted Pyramid");
            drawInvertedPyramid(rows);
        }
        else {
            System.out.println("Invalid choice! Please select a number between 1 and 4.");
        }

        scanner.close();
    }

    public static void drawRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawInvertedRightTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawInvertedPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
