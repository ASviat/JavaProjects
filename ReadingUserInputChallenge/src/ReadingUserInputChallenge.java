import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        System.out.println("The sum of entered numbers is: " + enterNumbersAndSumThem(5));
    }

    public static int enterNumbersAndSumThem(int howMuchNumbers) {
        int counter = 1;
        int sumNumbers = 0;
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (counter <= howMuchNumbers) {
            System.out.println("Enter number " + counter + ": ");
            input = scanner.nextLine();
            if (isValid(input)) {
                sumNumbers += Integer.parseInt(input);
                counter++;
            } else {
                System.out.println("Invalid data. Please, redo");
            }
        }
        scanner.close();
        return sumNumbers;
    }

    public static boolean isValid(String inputString) {
        try {
            int number = Integer.parseInt(inputString);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid number entered");
            return false;
        }
    }
}
