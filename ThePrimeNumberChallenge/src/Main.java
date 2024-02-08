public class Main {

    public static void main(String[] args) {

        System.out.println("Total primes: " + countPrimeNumbers(1000));
        System.out.println();

    }

    public static boolean isPrime(int wholeNumber) {
//        if (wholeNumber <= 2) {
//            return (wholeNumber == 2);
//        }

        for (int divisor = 2; divisor < wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimeNumbers(int maxNumber) {
        if (maxNumber > 3) {
            int counter = 2;
            System.out.println("Prime №1: 2");
            System.out.println("Prime №2: 3");
            for (int i = 5; i <= maxNumber; i++) {

                if (isPrime(i)) {
                    System.out.println("Prime №" + counter + ": " + i);
                    counter++;
                }
            }
            return counter;
        } else if (maxNumber == 2) {
            System.out.println("Prime №1: 2");
            return 1;
        } else if (maxNumber == 3) {
            System.out.println("Prime №1: 2");
            System.out.println("Prime №2: 3");
            return 2;
        } else {
            System.err.println("Invalid data");
            return -1;
        }
    }
}
