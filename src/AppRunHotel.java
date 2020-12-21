import hotel.Hotel;
import hotel.HotelManagement;
import person.Person;
import person.PersonManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppRunHotel {

    public static List<Person> personList = new ArrayList<>();
    public static List<Hotel> hotelList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start:
        do {
            System.out.println("menu:");
            System.out.println("1: hotel management");
            System.out.println("2: person management");
            int i = scanner.nextInt();

            switch (i) {
                case 1:
                    System.out.println("Menu1");

                    System.out.println("Enter 1: Add new");
                    System.out.println("Enter 2: Show  list");
                    System.out.println("Enter 3: Checkin");
                    System.out.println("Enter 4: showPerson");
                    System.out.println("Enter 5: Checkout");
                    System.out.println("Enter 6: Exit the system");
                    System.out.println("Enter 0: Back");
                    int k = scanner.nextInt();

                    switch (k) {
                        case 1:
                            Hotel hotel = HotelManagement.createHotel();
                            if (hotel != null) {
                                hotelList.add(hotel);
                            }
                            break;
                        case 2:
                            HotelManagement.showHotel(hotelList);
                            break;
                        case 3:
                            HotelManagement.checkin(hotelList);
                            break;
                        case 4:
                            HotelManagement.showPerson(hotelList);
                            break;
                        case 5:
                            HotelManagement.checkout(hotelList);
                            break ;
                        case 6:
                            System.exit(0);
                            break;
                        case 0:
                            continue start;
                        default:
                            System.out.println("try again");
                    }
                    break;

                case 2:
                    System.out.println("Menu");
                    System.out.println("Enter 1: Show  list");
                    System.out.println("Enter 2: Add new");
                    System.out.println("Enter 3: Remove");
                    System.out.println("Enter 6: Exit the system");
                    int n = scanner.nextInt();
                    switch (n) {
                        case 1:
                            System.out.println("list of person");
                            PersonManagement.showListPerson(personList);
                            break;
                        case 2:
                            System.out.println("creat person");
                            Person newPerson = PersonManagement.createPerson();
                            if (newPerson != null) {
                                personList.add(newPerson);
                            }
                            break;
                        case 3:
                            PersonManagement.deletePerson(personList);
                            break;
                        case 0:
                            continue start;
                        default:
                            System.out.println("try again");
                    }
            }
        } while (true);

    }

}
