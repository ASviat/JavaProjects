public class NumberInWord {

    public static void main(String[] args) {

        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(4);
        printNumberInWord(9);
        printNumberInWord(10);
        printNumberInWord(-1);
    }

    public static void printNumberInWord(int number) {

        switch (number) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            default -> System.out.println("Other");
        }
    }
}
