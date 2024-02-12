public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        } else {
            int greatestDivisor = 0;

            for (int j = second; j > 0; j--) {
                if (second % j == 0 && first % j == 0) {
                    greatestDivisor = j;
                    break;
                }
            }
            return greatestDivisor;
        }
    }
}
