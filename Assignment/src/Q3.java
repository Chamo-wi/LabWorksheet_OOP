import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an interger");
        double cm = scanner.nextDouble();

        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        inches = inches % 12;

        System.out.printf("%.0f cm is approximately %d feet and %.2f inches.\n", cm, feet, inches);

        scanner.close();
    }
}
