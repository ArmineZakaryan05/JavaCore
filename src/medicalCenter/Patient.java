package medicalCenter;

public class Patient {
    private  String id;
    private String name;
    private String surname;
    private String phone;
    private String registerdatetime;

    public Patient(String id, String name, String surname, String phone, String registerdatetime) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.registerdatetime = registerdatetime;
    }

    public Patient() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getRegisterdatetime() {
        return registerdatetime;
    }

    public void setRegisterdatetime(String registerdatetime) {
        this.registerdatetime = registerdatetime;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", registerdatetime='" + registerdatetime + '\'' +
                '}';
    }
}
