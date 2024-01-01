public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(0);
        printYearsAndDays(-1515);

    }

    public static void printYearsAndDays(long minutes) {
        long years = (minutes / 60) / 24 / 365;

        System.out.println(minutes >= 0 ? String.format(minutes + " min = " + years + " y and " + (minutes / 60 / 24 % 365) + " d") : "Invalid Value");

    }
}
