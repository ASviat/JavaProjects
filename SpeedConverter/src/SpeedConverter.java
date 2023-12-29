public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
        System.out.println("---------");
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometresPerHour) {

        return kilometresPerHour >= 0 ? (long) (Math.round(kilometresPerHour / 1.609)) : (long) (-1);
    }
    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour >= 0 ? (kilometersPerHour + " km/h = " + Math.round(kilometersPerHour / 1.609) + " mi/h") : "Invalid Value");
    }
}


