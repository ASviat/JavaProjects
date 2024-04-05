import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String dateOfBirth, String endDate, long employeeId, String hireDate,
                            double annualSalary) {
        super(name, dateOfBirth, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;

    }

    @Override
    public String toString() {
        return super.toString() +
                "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} ";
    }

    public void retire() {
        terminate(LocalDate.now().toString());
        this.isRetired = true;
    }

    @Override
    public double collectPay() {
        return this.annualSalary / 26;
    }
}
