package medicalCenter;

import java.util.Scanner;

public class Person {

    private static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage = new PatientStorage();


    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addDoctor();
                    break;
                case "2":
                    searchDoctorByProfession();
                    break;
                case "3":
                    deleteDoctorById();
                    break;
                case "4":
                    changeDoctorById();
                    break;
                case "5":
                    addPatient();
                    break;
                case "6":
                    patientStorage.print();
                    doctorStorage.print();
                    break;
                case "7":
                    patientStorage.print();
                    break;
                default:
                    System.out.println("invalid command.Try again!");
            }
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input doctor profession ");
        String doctorProfession = scanner.nextLine();
        Doctor byProfession = doctorStorage.getByProfession(doctorProfession);
        if (byProfession == null) {
            System.out.println("doctor does not exists");
        } else {
            System.out.println(byProfession);
        }
    }


    private static void changeDoctorById() {
        System.out.println("Please input doctor id");
        String DoctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(DoctorId);
        if (doctorFromStorage == null) {
            System.out.println("Doctor with " + DoctorId + " does not exists!!!");
            return;
        }
        System.out.println("please input new doctor name");
        String doctorName = scanner.nextLine();
        System.out.println("please input new doctor surname");
        String doctorSurName = scanner.nextLine();
        System.out.println("please input new doctor email");
        String doctorEmail = scanner.nextLine();
        System.out.println("please input new doctor PhoneNumber");
        String doctorPhoneNumber = scanner.nextLine();
        System.out.println("please input new doctor profession ");
        String doctorProfession = scanner.nextLine();
        doctorFromStorage.setName(doctorName);
        doctorFromStorage.setSurname(doctorSurName);
        doctorFromStorage.setEmail(doctorEmail);
        doctorFromStorage.setPhoneNumber(doctorPhoneNumber);
        doctorFromStorage.setProfession(doctorProfession);
        System.out.println("doctor updated");
    }

    private static void deleteDoctorById() {
        System.out.println("Please choose doctor id");
        doctorStorage.print();
        String DoctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(DoctorId);
        if (doctorFromStorage == null) {
            System.out.println("doctor with " + DoctorId + " does not exists!!!");
            return;
        }
        doctorStorage.deleteById(DoctorId);
    }


    private static void addPatient() {
        System.out.println("Please choose doctor id");
        doctorStorage.print();
        String doctorId = scanner.nextLine();
        Doctor doctor = doctorStorage.getById(doctorId);
        if (doctor == null) {
            System.out.println(" Doctor with " + doctorId + " does not exists! ");
            return;
        }
        System.out.println("Please patient id ");
        String patientId = scanner.nextLine();
        Patient patient = patientStorage.getById(patientId);
        if (patient != null) {
            System.out.println("patient with " + patientId + "id already exists");
            return;
        }
        System.out.println("please input patient name");
        String patientName = scanner.nextLine();
        System.out.println("please input patient SurName");
        String patientSurName = scanner.nextLine();
        System.out.println("please input patient phone");
        String patientPhone = scanner.nextLine();
        System.out.println("please input patient RegisterDateTime ");
        String patientRegisterDateTime = scanner.nextLine();
        Patient patients = new Patient(patientId, patientName, patientSurName, patientPhone, patientRegisterDateTime);
        patientStorage.add(patients);
        System.out.println("patient registered!");

    }

    private static void addDoctor() {
        System.out.println("please input doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctor = doctorStorage.getById(doctorId);
        if (doctor != null) {
            System.out.println(" Doctor with " + doctorId + " already exists! ");
            return;
        }
        System.out.println("please input doctor name");
        String doctorName = scanner.nextLine();
        System.out.println("please input doctor surname");
        String doctorSurName = scanner.nextLine();
        System.out.println("please input doctor email");
        String doctorEmail = scanner.nextLine();
        System.out.println("please input doctor phoneNumber");
        String doctorPhoneNumber = scanner.nextLine();
        System.out.println("please input doctor profession");
        String doctorProfession = scanner.nextLine();
        Doctor doctors = new Doctor(doctorId, doctorName, doctorSurName, doctorEmail, doctorPhoneNumber, doctorProfession);
        doctorStorage.add(doctors);
        System.out.println("doctor registered.");
    }


    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add doctor");
        System.out.println("Please input 2 for search doctor by profession");
        System.out.println("Please input 3 for delete doctor by id");
        System.out.println("Please input 4 for change doctor by id");
        System.out.println("Please input 5 for add patient ");
        System.out.println("Please input 6 for print all patients by doctor");
        System.out.println("Please input 7 for print all patients");

    }
}
