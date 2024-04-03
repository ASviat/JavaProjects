public class Customer {

    private String name;
    private double credit;
    private String emailAddress;


    public static void main(String[] args) {

        Customer customer = new Customer();
        Customer customer2 = new Customer("Noonga", 655, "noongas@email.com");
        Customer customer3 = new Customer("Sasas", "sasas@email.com");

        System.out.println(customer.getName() + " " + customer.getCredit() + " " + customer.getEmailAddress());
        System.out.println(customer2.getName() + " " + customer2.getCredit() + " " + customer2.getEmailAddress());
        System.out.println(customer3.getName() + " " + customer3.getCredit() + " " + customer3.getEmailAddress());

    }


    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer(String name, double credit, String emailAddress) {
        this.name = name;
        this.credit = credit;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        this("Default_Name", 1.0, "default@email.com");
    }

    public Customer(String name, String emailAddress) {
        this();
        this.name = name;
        this.emailAddress = emailAddress;
    }
}
