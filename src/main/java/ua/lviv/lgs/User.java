package ua.lviv.lgs;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int number_phone;
    private String adress;

    public User(String firstName, String lastName, int number_phone, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number_phone = number_phone;
        this.adress = adress;
    }

    public User(int id, String firstName, String lastName, int number_phone, String adress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.number_phone = number_phone;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumber_phone() {
        return number_phone;
    }

    public void setNumber_phone(int number_phone) {
        this.number_phone = number_phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number_phone=" + number_phone +
                ", adress='" + adress + '\'' +
                '}';
    }
}