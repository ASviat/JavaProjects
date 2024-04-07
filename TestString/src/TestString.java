public class TestString {

    public static void main(String[] args) {
        String string = "Hello World!";
        int length = string.length();
        System.out.printf("%d\n", length);
        System.out.printf("First char is %c\n", string.charAt(0));
        System.out.printf("Last char is %c\n", string.charAt(length - 1));
        System.out.println(string.isEmpty() ? "String is Empty" : "String isn't empty");

        String helloWorld = "Hello World";
        System.out.printf("Word \"World\" in phrase \"" + helloWorld + "\" starts at char %d\n",
                helloWorld.indexOf("World"));
        System.out.printf("indexOf(l) = %d\n", helloWorld.indexOf('l'));
        System.out.printf("lastIndexOf(l) = %d\n", helloWorld.lastIndexOf('l'));
        System.out.printf("Second indexOf(l) = %d\n", helloWorld.indexOf('l', 3));
        System.out.printf("lastIndexOf(l) = %d\n", helloWorld.lastIndexOf('l', 8));
        String string2 = "hello world!";
        if (string.equals(string2)) {
            System.out.println("Strings are equal");
        }
        if (string.equalsIgnoreCase(string2)) {
            System.out.println("string.equalsIgnoreCase(string2) -- Strings are equal");
        }
        System.out.println(helloWorld.startsWith("Hello"));
        System.out.println(helloWorld.endsWith("World"));
        System.out.println(helloWorld.contains("lo Wor"));
        System.out.println(helloWorld.contentEquals("Hello World"));
        System.out.println(helloWorld.contentEquals("Hello Worl"));
        helloWorld += " faster!";
        System.out.println(helloWorld);
        System.out.println(helloWorld.substring(6));
        System.out.println(helloWorld.substring(6, 11) + "!");
        String newDate = String.join("/", "10", "05", "1990");
        System.out.println(newDate);
        String date = "25";
        date = date.concat("/");
        date = date.concat("11");
        date = date.concat("/");
        date = date.concat("2005");
        System.out.println(date);
        date = "25".concat("/").concat("10").concat("/").concat("2000");
        System.out.println(date);
        System.out.println(date.replace('/', '.'));
        System.out.println(date.replace("25", "1"));
        System.out.println(date.replaceFirst("/", "-"));
        System.out.println(date.replaceAll("/", "--"));

        System.out.println("Text\n".repeat(2));
        System.out.println("-".repeat(20));

        System.out.println("Text\n".repeat(2).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    Text\n".repeat(2).indent(-2));
        System.out.println("-".repeat(20));

        String x = """
                Text Block in action, babe!
                """;
        System.out.println(x);
    }
}
