public class Employee extends Worker {
    private long employeeId;
    private String hireDate;


    public Employee(String name, String dateOfBirth, String endDate, long employeeId, String hireDate) {
        super(name, dateOfBirth, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} ";
    }
}
