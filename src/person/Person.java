package person;

public class Person {
    String name;
    String dateOfBirth;
    String idNumber;

    public Person() {
    }

    public Person(String name, String dateOfBirth, String idNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
