public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Mike", "12.02.1996", "");
        System.out.println(worker.getAge());
        System.out.println(worker);

        Worker worker2 = new Worker();
        System.out.println(worker2);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("John", "12.05.1990",
                "Still working", Worker.counter++, "25.03.1982", "10");
        System.out.println(hourlyEmployee);
        hourlyEmployee.getDoublePay();
        System.out.println(hourlyEmployee);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Sasha", "14.01.1976",
                "Still working", Worker.counter++, "22.09.1992", 50000.50, false);
        System.out.println(salariedEmployee);
        salariedEmployee.retire();
        System.out.println(salariedEmployee);
    }
}
