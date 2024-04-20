package Registry;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Patient {

    private String name;
    private Date dateOfEntrance;
    private String dateOfBirth;
    private String patientsState;

    public Patient() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println();
            System.out.println("Введите имя пациента: ");
            this.name = input.nextLine();
            this.dateOfEntrance = Calendar.getInstance().getTime();

            System.out.println("Введите дату рождения пациента в формате дд-мм-гггг: ");

            this.dateOfBirth = input.nextLine(); // Разобраться с датой(проверкой)

            inputPatientsState();

        } catch (Exception e) {
            System.out.println("Ошибка ввода " + e.getMessage() + "\nПовторите ввод:");
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", dateOfEntrance=" + dateOfEntrance +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", patientsState='" + patientsState + '\'' +
                '}';
    }

    private void inputPatientsState() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("""
                    Выберите актуальное состояние пациента:
                    1. Удовлетворительное
                    2. Средней тяжести
                    3. Тяжелое
                    4. Крайне тяжелое
                    5. Агония""");
            switch (input.nextInt()) {
                case 1 -> this.patientsState = "Состояние удовлетворительное";
                case 2 -> this.patientsState = "Состояние средней тяжести";
                case 3 -> this.patientsState = "Состояние тяжелое";
                case 4 -> this.patientsState = "Состояние крайне тяжелое";
                case 5 -> this.patientsState = "Состояние агонии";
                default -> {
                    System.out.println("Выбран некорректный вариант, повторите ввод");
                    inputPatientsState();
                }
            }
        }

    }
}
