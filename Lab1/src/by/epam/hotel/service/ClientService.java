package by.epam.hotel.service;
import by.epam.hotel.dao.ClientController;
import by.epam.hotel.entity.User;

import java.util.ArrayList;

public class ClientService extends Service<User>{

    private ClientController controller;

    public ClientService(){
        controller = new ClientController();
    }

    @Override
    public void create(User entity) {
        controller.create(entity);
    }

    @Override
    public void read() {
        controller.read();
    }

    @Override
    public void update(User entity) {
        controller.update(entity);
    }

    @Override
    public void delete(User entity) {
        controller.delete(entity);
    }

    @Override
    public void save() {
        controller.save();
    }

    @Override
    public ArrayList<User> getData() {
        return controller.getData();
    }
}