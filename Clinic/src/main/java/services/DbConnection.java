package services;

import models.Patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnection {

    private String url = "jdbc:mysql://registry-db:5001/clinicsregistry";
    private String user = "root";
    private String password = "Password";




    public void getConnection(Patient patient) {
        try {


            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Вход в СУБД выполнен.");
//            useDatabase(connection);
            System.out.println("Вход в базу банных clinicsregistry выполнен"); //хардкод
            createTable(connection);
            System.out.println("Таблица успешно создана");
            insertData(connection,patient);

        } catch (SQLException e) {
            System.out.println("Ошибка!\n" + e.getMessage());
        }
    }

//    private void useDatabase(Connection connection) {
//        String useDatabaseSQL = "USE clinicsregistry;";
//        try (PreparedStatement statement = connection.prepareStatement(useDatabaseSQL)) {
//            statement.execute();
//        } catch (SQLException e) {
//            System.out.println("Ошибка!\n" + e.getMessage());
//        }
//    }

    //No date
    private void createTable(Connection connection) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS patients (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200), dateofbirth VARCHAR(30), state VARCHAR(30));";
        try (PreparedStatement statement = connection.prepareStatement(createTableSQL)) {
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Ошибка!\n" + e.getMessage());
        }
    }

    /**
     * Добавление данных в таблицу users
     *
     * @param connection Соединение с БД
     * @param patient    Пациент
     */
    public void insertData(Connection connection, Patient patient) {
        String insertDataSQL = "INSERT INTO patients (name, dateofbirth, state) VALUES (?, ?, ?);";
        try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
            statement.setString(1, patient.getName());
            statement.setString(2, patient.getDateOfBirth());
            statement.setString(3, patient.getPatientsState());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Ошибка!\n" + e.getMessage());
        }
    }
}