public class HourlyEmployee extends Employee {
    private String hourlyPayRate;

    public HourlyEmployee(String name, String dateOfBirth, String endDate, long employeeId, String hireDate,
                          String hourlyPayRate) {
        super(name, dateOfBirth, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay() {
        int doubledPayRate = (Integer.parseInt(this.hourlyPayRate)) * 2;
        this.hourlyPayRate = Integer.toString(doubledPayRate);
    }

    @Override
    public String toString() {
        return super.toString() +
                "HourlyEmployee{" +
                "hourlyPayRate='" + hourlyPayRate + '\'' +
                "} ";
    }
}
