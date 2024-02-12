public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
        System.out.println(sumFirstAndLastDigit(-55));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(10));
        System.out.println(sumFirstAndLastDigit(14));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;

        } else {

            int sumFirstAndLastDigit = number % 10;

            while (number != 0) {
                if (number / 10 == 0) {
                    sumFirstAndLastDigit += number % 10;
                }
                number /= 10;
            }

            return sumFirstAndLastDigit;
        }
    }
}