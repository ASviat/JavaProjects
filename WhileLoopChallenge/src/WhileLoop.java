public class WhileLoop {
    public static void main(String[] args) {
        printEvenNumbers(4, 20);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0 && number > 0;
    }

    public static void printEvenNumbers(int start, int end) {
        int countEven = 0;
        int countOdd = 0;
        while (start <= end && countEven < 5) {
            start++;
            if (!isEvenNumber(start)) {
                countOdd++;
                continue;
            }
            System.out.println("Even found: " + start);
            countEven++;

        }
        System.out.println("Total odds: " + countOdd);
        System.out.println("Total evens: " + countEven);
    }
}
