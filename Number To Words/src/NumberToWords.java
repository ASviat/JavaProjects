public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(100);
        System.out.println();
        numberToWords(-1);
        System.out.println();
        numberToWords(54211);
        System.out.println();
        numberToWords(606);
        System.out.println();
        numberToWords(-2521);
        System.out.println();


    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int countDigitsBeforeReverse = getDigitCount(number);
            int countDigitsAfterReverse = getDigitCount(reverse(number));
            int reversedNumber = reverse(number);
            while (reversedNumber > 0) {
                switch (reversedNumber % 10) {
                    case 0 -> System.out.print("Zero ");
                    case 1 -> System.out.print("One ");
                    case 2 -> System.out.print("Two ");
                    case 3 -> System.out.print("Three ");
                    case 4 -> System.out.print("Four ");
                    case 5 -> System.out.print("Five ");
                    case 6 -> System.out.print("Six ");
                    case 7 -> System.out.print("Seven ");
                    case 8 -> System.out.print("Eight ");
                    case 9 -> System.out.print("Nine ");
                }
                reversedNumber /= 10;
            }
            if (countDigitsBeforeReverse > countDigitsAfterReverse) {
                for (int i = 0; i < countDigitsBeforeReverse - countDigitsAfterReverse; i++) {
                    System.out.print("Zero ");
                }
            }
            if (number == 0) {
                System.out.print("Zero ");
            }
        }
    }

    public static int reverse(int number) {
        if (number == 0) {
            return 0;
        }
        String reverseString = "";


        if (number < 0) {

            while (number != 0) {
                reverseString += Integer.toString((number % 10) * -1);
                number /= 10;

            }
            return Integer.parseInt(reverseString) * -1;
        } else {
            while (number != 0) {
                reverseString += Integer.toString(number % 10);
                number /= 10;
            }
            return Integer.parseInt(reverseString);
        }

    }


    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        } else {
            int counter = 0;
            while (number > 0) {
                counter++;
                number /= 10;
            }
            return counter;
        }
    }
}
