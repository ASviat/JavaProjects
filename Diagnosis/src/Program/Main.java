package Program;

import Registry.Doctor;
import Registry.Patient;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient();
        Doctor doctor = new Doctor("Alexander");
        System.out.println(patient + "\nна приеме у\n" + doctor);


    }
}
