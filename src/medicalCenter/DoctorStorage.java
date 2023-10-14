package medicalCenter;

public class DoctorStorage {

    private Doctor[] doctors = new Doctor[10];
    private int size;


    public void add(Doctor doctor) {
        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);

        }
    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, doctors.length);
        doctors = tmp;
    }

    public Doctor getById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                return doctors[i];
            }
        }
        return null;
    }

    public void deleteById(String doctorId) {
        int IndexById = getIndexById(doctorId);
        if (IndexById == -1) {
            System.out.println("Company does not exists!");
            return;
        }
        for (int i = IndexById + 1; i < size; i++) {
            doctors[i - 1] = doctors[i];
        }
        size--;
    }

    private int getIndexById(String DoctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(DoctorId)) {
                return i;
            }
        }
        return -1;
    }

    public Doctor getByProfession(String doctorProfession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equals(doctorProfession)) {
                System.out.println(doctors[i]);
            }
        }
        return null;
    }
}



