package by.epam.hotel.run;

import by.epam.hotel.collections.Gender;
import by.epam.hotel.entity.HotelRoom;
import by.epam.hotel.entity.Client;
import by.epam.hotel.entity.Order;
import by.epam.hotel.service.HotelRoomService;
import by.epam.hotel.service.OrderService;
import by.epam.hotel.service.ClientService;

import java.util.Scanner;

public class DataManager {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)  {
        while (true) {
            System.out.println("Choose what to manage: \n1.Client manager\n2.HotelRoom manager\n3.Order manager\n0.Exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    clientManager();
                    break;
                }
                case 2: {
                    hotelRoomManager();
                    break;
                }
                case 3: {
                    orderManager();
                    break;
                }
                case 0:
                    System.exit(0);
                default:
                    continue;
            }
        }
    }

    private static void clientManager() {
        ClientService controller = new ClientService();
        controller.read();
        while (true) {
            System.out.println("Choose what to do: \n1.Add\n2.Delete\n3.Update\n4.Show All\n0.Back");
            int choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    controller.create(clientBuilder());
                    break;
                }
                case 2: {
                    controller.delete(clientBuilder());
                    break;
                }
                case 3: {
                    controller.update(clientBuilder());
                    break;
                }
                case 4: {
                    System.out.println(controller.getData().toString());
                    break;
                }
                case 0: {
                    controller.save();
                    main(new String[0]);
                }
                default:
                    continue;
            }
        }
    }

    private static void hotelRoomManager() {
        HotelRoomService controller = new HotelRoomService();
        controller.read();
        while (true) {
            System.out.println("Choose what to do: \n1.Add\n2.Delete\n3.Update\n4.Show All\n0.Back");
            int choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    controller.create(hotelRoomBuilder());
                    break;
                }
                case 2: {
                    controller.delete(hotelRoomBuilder());
                    break;
                }
                case 3: {
                    controller.update(hotelRoomBuilder());
                    break;
                }
                case 4: {
                    System.out.println(controller.getData().toString());
                    break;
                }
                case 0: {
                    controller.save();
                    main(new String[0]);
                }
                default:
                    continue;
            }
        }
    }

    private static void orderManager() {
        OrderService controller = new OrderService();
        controller.read();
        while (true) {
            System.out.println("Choose what to do: \n1.Add\n2.Delete\n3.Update\n4.Show All\n0.Back");
            int choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    controller.create(orderBuilder());
                    break;
                }
                case 2: {
                    controller.delete(orderBuilder());
                    break;
                }
                case 3: {
                    controller.update(orderBuilder());
                    break;
                }
                case 4: {
                    System.out.println(controller.getData().toString());
                    break;
                }
                case 0: {
                    controller.save();
                    main(new String[0]);
                }
                default:
                    continue;
            }
        }
    }

    public static Client clientBuilder() {
        Scanner sc = new Scanner(System.in);
        Client client = new Client();
        System.out.println("Enter first name:");
        client.setFirstName(sc.nextLine());
        System.out.println("Enter last name:");
        client.setLastName(sc.nextLine());
        System.out.println("Enter phone number:");
        client.setPhoneNumber(sc.nextLine());
        System.out.println("Enter age:");
        client.setAge(sc.nextInt());
        System.out.println("Enter gender:");
        Gender gender = Gender.valueOf(sc.next().toUpperCase());
        client.setGender(gender);
        System.out.println("Enter class of apartament (Lux/Medium/Standart):");
        client.setClassApartament(sc.next());
        System.out.println("Enter number of seats person:");
        client.setNumberPerson(sc.nextInt());
        return client;
    }

    public static HotelRoom hotelRoomBuilder() {
        Scanner sc = new Scanner(System.in);
        HotelRoom car = new HotelRoom();
        System.out.println("Enter class of apartament (Lux/Medium/Standart): ");
        car.setClassApartament(sc.nextLine());
        System.out.println("Enter nuber of seats:");
        car.setNumberSeats(sc.nextInt());
        System.out.println("Enter price:");
        car.setPrice(sc.nextDouble());
        System.out.println("Enter id:");
        car.setId(sc.nextInt());
        return car;
    }

    public static Order orderBuilder() {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();
        order.setClient(clientBuilder());
        order.setHotelRoom(hotelRoomBuilder());
        System.out.println("Enter days:");
        order.setDay(sc.nextInt());
        System.out.println("Enter id:");
        order.setId(sc.nextInt());
        return order;
    }
}