package person;

import java.util.List;
import java.util.Scanner;

public class PersonManagement {
//    show list person
    public static void showListPerson(List<Person> personList){
//        System.out.println("list of person");
//        for (int i = 0; i < personList.size(); i++) {
//            System.out.println(personList.get(i));
//        }
        for (Person p : personList) {
            System.out.println(p.toString());
        }
    }
//    create person
    public static Person createPerson(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter DOB");
        String dOB = scanner.nextLine();

        System.out.println("Enter id");
        String idNumber = scanner.nextLine();

        Person person = new Person(name, dOB, idNumber);

        return person;
    }

//    delete
    public static void deletePerson(List<Person> personList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the identity number of the person you want to remove");

        String checkId = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < personList.size(); i++) {

            if (checkId.equals(personList.get(i).getIdNumber())) {
                check = true;
                personList.remove(personList.get(i));
            }else check = false;
        }
        if (check == false){
            System.out.println("not found");
        }else {
            System.out.println("successful");
        }
    }
}
