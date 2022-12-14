import java.util.ArrayList;
import java.xutil.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        int choose;
        Scanner scanner = new Scanner(System.in);
        ArrayList<HotellGuests> hotelGuests = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Insert data");
            System.out.println("2. Print data");
            System.out.println("3. Print names and price of particular city");
            System.out.println("4. Exit");
            System.out.print("Choose an option: "); choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println();
                    hotelGuests.add(insertData(scanner));
                    break;
                case 2:
                    System.out.println();
                    printData(hotelGuests);
                    break;
                case 3:
                    System.out.println();
                    printHotelGuestsFromParticularCity(hotelGuests, scanner);
                    break;
                case 4: exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    public static void printData(ArrayList<HotelGuests> hotelGuests) {
        System.out.println("Print all data!");
        for (HotelGuests h : hotelGuests) {
            System.out.println(h.toString());
        }
    }

    public static HotelGuests insertData(Scanner scanner) {

        String nothing = scanner.nextLine();
        String name;
        String ucn;
        int martialStatus;
        int nights;
        double beds;
        String city;

        System.out.println("Insert data!");
        System.out.println();
        System.out.print("Name: "); name = scanner.nextLine();
        System.out.println();
        System.out.print("UCN: "); ucn = scanner.nextLine();
        System.out.println();
        System.out.print("Martial Status 1 for engaged or 2 for single: "); martialStatus = scanner.nextInt();
        System.out.println();
        System.out.print("Nights: "); nights = scanner.nextInt();
        System.out.println();
        System.out.print("Price for beds: "); beds = scanner.nextInt();
        System.out.println();
        String nothing1 = scanner.nextLine();
        System.out.print("City: "); city = scanner.nextLine();

        return new HotelGuests(name, ucn, martialStatus, nights, beds, city);
    }

    public static void printHotelGuestsFromParticularCity(ArrayList<HotelGuests> hotelGuests, Scanner sc) {

        int totalPrice = 0;
        ArrayList<HotelGuests> newStudents = new ArrayList<>();

        String nothing = sc.nextLine();

        System.out.println();
        System.out.println("Enter a city: ");
        String city = sc.nextLine();

        for (HotelGuests h : hotelGuests) {
            if(h.city.equals(city)) {
                newStudents.add(h);
                totalPrice += h.beds;
            }
        }

        System.out.println();
        for (HotelGuests h : newStudents) {
            System.out.println("Guest name: " + h.name);
        }

        System.out.println("Total price for beds of the beds: " + totalPrice);
    }
}