public class ForLoop {
    public static void main(String[] args) {
        calculateInterest(100);
    }

    public static void calculateInterest(double money) {
        for (double i = 7.5; i <= 10.0; i += 0.25) {
            if (i > 8.5) {
                break;
            }
            System.out.println(money + "$ at " + i + "% interest = " + money * (i / 100) + "$");
        }
    }
}
