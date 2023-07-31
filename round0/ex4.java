
// package round0;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the pyramid: ");
        int length = scanner.nextInt();
        scanner.close();

        printPyramid(length);
    }

    public static void printPyramid(int length) {
        for (int i = 1; i <= length; i++) {
            // Print spaces before the stars
            for (int j = length - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}