package hotel;

import person.Person;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    String roomNumber;
    int dayRent;
    int kindOfRoom;
    int rentCost;
//    Person tenants;
    List<Person> persons = new ArrayList<>();

    int rentedDay;

    public Hotel() {
    }

    public Hotel(String roomNumber, int dayRent, int kindOfRoom, int rentCost, List<Person> persons, int rentedDay) {
        this.roomNumber = roomNumber;
        this.dayRent = dayRent;
        this.kindOfRoom = kindOfRoom;
        this.rentCost = rentCost;
        this.persons = persons;
        this.rentedDay = rentedDay;
    }


    public void addPerson(Person person){
        persons.add(person);

    }

    public Hotel(String roomNumber, int dayRent, int kindOfRoom, int rentCost) {
        this.roomNumber = roomNumber;
        this.dayRent = dayRent;
        this.kindOfRoom = kindOfRoom;
        this.rentCost = rentCost;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public Hotel(String roomNumber, int dayRent, int kindOfRoom, int rentCost, List<Person> persons) {
        this.roomNumber = roomNumber;
        this.dayRent = dayRent;
        this.kindOfRoom = kindOfRoom;
        this.rentCost = rentCost;
        this.persons = persons;
    }

    public int getDayRent() {
        return dayRent;
    }

    public void setDayRent(int dayRent) {
        this.dayRent = dayRent;
    }

    public int getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(int kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public int getRentedDay() {
        return rentedDay;
    }

    public void setRentedDay(int rentedDay) {
        this.rentedDay = rentedDay;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "roomNumber='" + roomNumber + '\'' +
                ", dayRent=" + dayRent +
                ", kindOfRoom=" + kindOfRoom +
                ", rentCost=" + rentCost +
                ", persons=" + persons +
                ", rentedDay=" + rentedDay +
                '}';
    }
}
