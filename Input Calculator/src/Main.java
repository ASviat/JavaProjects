import java.util.Scanner;

public class Main {
    //    Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//
//    The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
//
//    When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
//
//    XX represents the sum of all entered numbers of type int.
//    YY represents the calculated average of all numbers of type long.
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }


    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        String nextNumber = "";
        int sum = 0;
        double avg = 0;
        int counter = 0;

        while (true) {

            System.out.println("Enter number #" + (counter + 1));
            nextNumber = scanner.nextLine();
            try {
                sum += Integer.parseInt(nextNumber);
            } catch (NumberFormatException nfe) {
                try {
                    avg += Double.parseDouble(nextNumber);
                    counter++;
                    System.out.println("SUM = " + sum + " AVG = " + avg / counter);
                } catch (NumberFormatException nfe2) {
                    System.out.println("SUM = " + sum + " AVG = " + avg / counter);
                    break;
                }
            }
        }
    }
}


