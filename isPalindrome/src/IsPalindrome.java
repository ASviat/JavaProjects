public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {

        String reverse = "";
        int lastDigit = 0;
        number = number < 0 ? number * -1 : number;
        int numberBefore = number;
        while (number != 0) {
            lastDigit = number % 10;
            reverse += Integer.toString(lastDigit);
            number /= 10;

        }
        return Integer.parseInt(reverse) == numberBefore;

    }
}
