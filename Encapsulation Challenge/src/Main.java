public class Main {
    public static void main(String[] args) {

        Printer printer1 = new Printer();
        System.out.println(printer1);
        printer1.printPages(250);
        System.out.println(printer1);
        printer1.addToner(5);
        System.out.println(printer1);
        printer1.printPages(11);
        System.out.println(printer1);
        printer1.setDuplex(true);
        printer1.printPages(20);
        System.out.println(printer1);
    }
}
