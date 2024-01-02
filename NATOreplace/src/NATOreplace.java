public class NATOreplace {
    public static void main(String[] args) {

        char myChar = 'E';

        switch (myChar) {
            case 'A':
                System.out.println(myChar +  " = Able");
                break;
            case 'B':
                System.out.println(myChar +  " = Baker");
                break;
            case 'C':
                System.out.println(myChar +  " = Charlie");
                break;
            case 'D':
                System.out.println(myChar +  " = Dog");
                break;
            case 'E':
                System.out.println(myChar +  " = Easy");
                break;
            default:
                System.out.println("Not found");

        }
    }
}
