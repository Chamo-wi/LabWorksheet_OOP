import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name (first middle last): ");
        String fullname = scanner.nextLine();

        String[] nameParts = fullname.split(" ");

        if (nameParts.length ==3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            char middleInitial = middleName.charAt(0);

            System.out.println(lastName + ", " + firstName + " " + middleInitial + ".");
        } else {
            System.out.println("Please enter your name in the format: first middle last.");
        }

        scanner.close();

    }
}