public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.1235));
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        return number1 <= 0 && number2 <= 0 ? Math.ceil(number1 * 1000) == Math.ceil(number2 * 1000) :
                number1 >= 0 && number2 >= 0 && Math.floor(number1 * 1000) == Math.floor(number2 * 1000);

    }

}
