public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(8));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            System.out.println("Invalid data entered:");
            return -1;
        } else {
            int sumDigits = 0;
            while (number != 0) {
                sumDigits += number % 10;
                number /= 10;
            }

            return sumDigits;
        }

    }


}
