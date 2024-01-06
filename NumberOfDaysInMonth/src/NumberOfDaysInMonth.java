public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }


    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 && year > 0 && year < 10000 || (year % 400 == 0 && year > 0 && year < 10000));
    }

    public static int getDaysInMonth(int month, int year) {

        return (month < 1 || month > 12 || year < 1 || year > 9999) ? -1 : (isLeapYear(year) && month == 2) ? 29 : switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> -1;
        };
    }
}

