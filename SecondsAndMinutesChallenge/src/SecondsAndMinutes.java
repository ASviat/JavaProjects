public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(12005));
        System.out.println(getDurationString(-16084));
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(85543));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));

    }

    public static String getDurationString(int seconds) {

        return seconds >= 0 ? getDurationString(seconds / 60, seconds % 60)
                : "Invalid data for seconds (" + seconds + "), must be a positive integer value.";
    }

    public static String getDurationString(int minutes, int seconds) {

        return minutes >= 0 && (seconds >= 0 && seconds < 60) ?
                String.format(minutes / 60 + " h, " + minutes % 60 + " m, " + seconds + " s")
                : seconds >= 60 ?
                String.format(minutes / 60 + " h, " + (minutes % 60 + seconds / 60) + " m, " + seconds % 60 + " s")
                : "Invalid data for minutes (" + minutes + ") or seconds (" + seconds + "), must be a positive integer value.";
    }
}