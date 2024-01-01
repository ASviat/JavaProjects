public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }


    public static boolean isCatPlaying(boolean summer, int temperature) {

        return summer && (temperature > 24 && temperature <= 45) || (!summer && (temperature > 24 && temperature <= 35));

    }
}
