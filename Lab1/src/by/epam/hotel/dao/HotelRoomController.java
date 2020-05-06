package by.epam.hotel.dao;

import by.epam.hotel.entity.HotelRoom;

public class HotelRoomController extends Controller<HotelRoom> {
    private static final String dir = "data/hotelroom.dat";

    public HotelRoomController() {
    }

    public String getDir() {
        return "data/hotelroom.dat";
    }
}
