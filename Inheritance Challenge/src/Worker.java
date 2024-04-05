import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;

public class Worker {
    private String name;
    private String dateOfBirth;
    private String endDate;

    public static int counter=1;

    public Worker() {

    }

    public Worker(String name, String dateOfBirth, String endDate) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getAge() {
        try {
            int currentYear = Year.now().getValue();
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            int yearOfBirth = (format.parse(this.dateOfBirth).getYear()) + 1900;
            return currentYear - yearOfBirth;
        } catch (ParseException pe) {
            System.out.println("Wrong data format. Enter dd.MM.yyyy");
            return 66;
        }
    }

    public double collectPay() {
        return 1;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }
}
