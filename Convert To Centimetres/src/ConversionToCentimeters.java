public class ConversionToCentimeters {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(5, 11));
        System.out.printf("%.2f",convertToCentimeters(66));
    }


    public static double convertToCentimeters(int entireHeightInInches) {
//        You'll convert inches to centimeters, in this method, and pass back the number of centimeters, as a double.

        return entireHeightInInches * 2.54; // 1 inch = 2.54 cm
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {
//        This method will convert feet and inches to just inches, then call the first method, to get the number of centimeters, also returning the value as a double.

        return convertToCentimeters(heightInFeet * 12 + remainingHeightInInches); // 1 foot = 12 inches
    }

}
