package by.epam.hotel.service;

import by.epam.hotel.dao.HotelRoomController;
import by.epam.hotel.entity.HotelRoom;

import java.util.ArrayList;

public class HotelRoomService extends Service <HotelRoom> {

    private HotelRoomController controller;

    public HotelRoomService(){
        controller = new HotelRoomController();
    }

    @Override
    public void create(HotelRoom entity) {
        controller.create(entity);
    }

    @Override
    public void read() {
        controller.read();
    }

    @Override
    public void update(HotelRoom entity) {
        controller.update(entity);
    }

    @Override
    public void delete(HotelRoom entity) {
        controller.delete(entity);
    }

    @Override
    public void save() {
        controller.save();
    }

    @Override
    public ArrayList<HotelRoom> getData() {
        return controller.getData();
    }
}
