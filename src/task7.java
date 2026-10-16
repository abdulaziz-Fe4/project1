public class task7 {
    public static void main() {
        System.out.println("EX: 7");
        for (int v = 1; v <= 20; v++) {
            if (v % 3 == 0 && v % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (v % 3 == 0) {
                System.out.println("Fizz");
            } else if (v % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(v);
            }
        }
    }
}
