public class EnhancedSwitch {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(7);
        printDayOfWeek(-1);
    }

    /*Create a method called printDayOfWeek, that takes an int parameter called day, but doesn't return any values.
    Use the enhanced switch statement, to return the name of the day, based on the parameter passed to the switch statement,
    so that 0 will return "Sunday", 1 will return "Monday", and so on.  Any number not between 0 and 6, should return "Invalid Day".
    Use the enhanced switch statement as an expression, returning the result to a String named dayOfTheWeek.
    Print both the day variable and the dayOfTheWeek variable.
    In the main method, call this method for the values 0 through 7.*/
    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> {
                yield "Monday";
            }
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Invalid day";

        };

        System.out.println(day + " stands for " + dayOfTheWeek);
    }

}
