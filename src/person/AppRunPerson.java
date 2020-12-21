//package person;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class AppRunPerson {
//    public static List<Person> personList = new ArrayList<>();
//
//    public static void main(String[] args) {
//        while (true){
//            menuPerson();
//        }
//    }
//
//    public static void menuPerson(){
//        System.out.println("Menu");
//        System.out.println("Enter 1: Show  list");
//        System.out.println("Enter 2: Add new");
//        System.out.println("Enter 3: Remove");
//        System.out.println("Enter 6: Exit the system");
//
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        switch (n){
//            case 1:
//                System.out.println("list of person");
//                PersonManagement.showListPerson(personList);
//                break;
//            case 2:
//                System.out.println("creat person");
//                Person newPerson = PersonManagement.createPerson();
//                if (newPerson != null){
//                    personList.add(newPerson);
//                }
//                break;
//            case 3:
//
//                PersonManagement.deletePerson(personList);
//                break;
//            default:
//                System.out.println("try again");
//        }
//    }
//}
