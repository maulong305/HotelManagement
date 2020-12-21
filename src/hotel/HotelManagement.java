package hotel;

import person.Person;

import java.util.List;
import java.util.Scanner;

public class HotelManagement {
//    show

    public static void showHotel(List<Hotel> hotelList){
        for (int i = 0; i < hotelList.size(); i++) {
            System.out.println(hotelList.get(i));
        }
    }

//    create
    public static Hotel createHotel(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter roomNumber");
        String roomNumber = scanner.nextLine();

        System.out.println("enter dayRent");
        int dayRent = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter kindOfRoom");
        int kindOfRoom = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter renCost");
        int rentCost = scanner.nextInt();
        scanner.nextLine();

        Hotel hotel = new Hotel(roomNumber,dayRent, kindOfRoom, rentCost);

        return hotel;
    }

//    checkin
    public static void checkin(List<Hotel> hotelList){
        System.out.println("Enter roomNumber");
        Scanner scanner = new Scanner(System.in);
        String roomNo = scanner.nextLine();


        for (Hotel h : hotelList){
            if (roomNo.equals(h.getRoomNumber())){
                System.out.println("Enter Name");
                String name=scanner.nextLine();
                System.out.println("Enter DOB");
               String dOB = scanner.nextLine();
                System.out.println("Enter ID");
                String idNo = scanner.nextLine();

                Person person = new Person(name, dOB, idNo);
                h.addPerson(person);
            }
        }
    }

    public static void showPerson(List<Hotel> hotelList){
        for (Hotel hotel: hotelList){
            System.out.println(hotel.getPersons());
        }
    }

    public static  void checkout(List<Hotel> hotelList){
        System.out.println("Enter ID");
        Scanner scanner = new Scanner(System.in);
        String id1 = scanner.nextLine();

        for (Hotel h : hotelList){
            for (int i = 0; i < h.getPersons().size(); i++) {
                if (id1.equals(h.getPersons().get(i).getIdNumber())){
                    System.out.println("Enter rentedDay");
                    int rentedDay = scanner.nextInt();
                    h.setRentedDay(rentedDay);

                    int total = (h.rentedDay)*(h.rentCost);
                    System.out.println("Total");
                    System.out.println(total);
                }

            }
        }
    }
}
