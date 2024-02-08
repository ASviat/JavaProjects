public class OmeMoreForLoop {
    public static void main(String[] args) {

        int counter = 0;
        int sumNumbers = 0;
        for (int i = 1; counter < 5 && i <= 1000; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(++counter + " number found: " + i);
                sumNumbers += i;
            }
        }
        System.out.println("Total sum: " + sumNumbers);
    }
}
