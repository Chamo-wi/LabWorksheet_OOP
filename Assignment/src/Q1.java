import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd-length word: ");
        String word = scanner.nextLine();

        int wordLength = word.length();

        if (wordLength % 2 ==0) {
            System.out.println("Please enter a word with an odd number of character.");
        }else{
            int middleIndex = wordLength / 2;

            System.out.println("The middle character is: " + word.charAt(middleIndex));
        }

        scanner.close();
    }
}
