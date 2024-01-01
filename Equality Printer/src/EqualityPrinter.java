public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
        printEqual(2, 1, 1);
    }

    public static void printEqual(int num1, int num2, int num3) {

        System.out.println(num1 < 0 || num2 < 0 || num3 < 0 ? "Invalid Value"
                : num1 == num2 && num1 == num3 ? "All numbers are equal"
                : (num1 == num2 && num1 != num3) || (num1 != num2 && num1 == num3) || (num1 != num2 && num2 == num3) ? "Neither all are equal or different"
                : "All numbers are different");


    }
}
