package program;

import models.Patient;
import services.DbConnection;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        System.out.println(patient);

        DbConnection connection = new DbConnection();
        connection.getConnection(patient);


    }
}
