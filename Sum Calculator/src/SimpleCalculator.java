public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;


    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        return secondNumber != 0.0 ? firstNumber / secondNumber : 0.0;
    }

    public static void main(String[] args) {


        SimpleCalculator sc = new SimpleCalculator();

        sc.setFirstNumber(2.34);
        sc.setSecondNumber(0);
        System.out.println(sc.getDivisionResult());
    }
}
