public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        } else {

            int sumEven = 0;
            int lastDigit = 0;
            while (number > 0) {
                lastDigit = number % 10;
                if (isEven(lastDigit)) {
                    sumEven += lastDigit;
                }
                number /= 10;
            }
            return sumEven;
        }
    }

    public static boolean isEven(int number) {

        return number % 2 == 0;
    }
}
