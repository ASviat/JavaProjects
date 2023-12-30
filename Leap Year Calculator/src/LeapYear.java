public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(10000));
        System.out.println(isLeapYear(2025));
        System.out.println(isLeapYear(2040));
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 && year > 0 && year < 10000 || (year % 400 == 0 && year > 0 && year < 10000));
    }
}
