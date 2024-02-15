import java.util.Scanner;

public class Main {
// Writes in the entered double to max. If other entered double is greater than max, then old max is written to min and the new max takes its place.
    public static void main(String[] args) {
        minAndMaxPlusEnteringNumbers();
    }

    public static void minAndMaxPlusEnteringNumbers() {
        Scanner scanner = new Scanner(System.in);

        double minNumber = 0;
        double maxNumber = 0;
        double currentNumber = 0;


        while (true) {

            try {
                System.out.println("Enter number: ");
                currentNumber = Double.parseDouble(scanner.nextLine());
                if (currentNumber > maxNumber) {
                    minNumber = maxNumber;
                    maxNumber = currentNumber;
                    currentNumber = 0;

                }
                if (currentNumber <= maxNumber && currentNumber > minNumber) {
                    minNumber = currentNumber;
                }
                if (minNumber != 0) {
                    System.out.println("Min = " + minNumber + "\nMax = " + maxNumber);
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Data");
                break;
            }
        }
        scanner.close();
    }
}
