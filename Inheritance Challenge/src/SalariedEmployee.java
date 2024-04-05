import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String dateOfBirth, String endDate, long employeeId, String hireDate,
                            double annualSalary, boolean isRetired) {
        super(name, dateOfBirth, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
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
        this.isRetired = true;
        String currentDate = LocalDate.now().toString();
        this.setEndDate(currentDate);
    }
}
