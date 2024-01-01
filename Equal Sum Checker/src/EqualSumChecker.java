public class EqualSumChecker {
    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int num1, int num2, int toMakeEqual) {
        return num1 + num2 == toMakeEqual;
    }


}
