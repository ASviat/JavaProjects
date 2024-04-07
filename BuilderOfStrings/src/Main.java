public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Wow, ");
        StringBuilder builder2 = new StringBuilder(32);

        builder.append("Hello World!\n");
        builder.append("Nice ".repeat(5));
        int lengthBuilder = builder.length();
        System.out.println(builder + " -- length() = " + lengthBuilder);

        builder2.append("Good night");
        System.out.println(builder2);
        builder2.deleteCharAt(0).insert(0, 'g');
        System.out.println(builder2);
        builder2.replace(0, 1, "G");
        System.out.println(builder2);

        builder2.reverse().setLength(5);
        System.out.println(builder2);

    }
}
