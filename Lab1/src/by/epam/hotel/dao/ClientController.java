package by.epam.hotel.dao;

import by.epam.hotel.entity.User;

public class ClientController extends Controller<User> {
    private static final String dir = "data/client.dat";

    public ClientController() {
    }

    public String getDir() {
        return "data/client.dat";
    }
}
