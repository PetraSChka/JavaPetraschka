package by.epam.hotel.dao;

import by.epam.hotel.entity.AvailableNumbers;

public class AvailableNumbersController extends Controller<AvailableNumbers>{
    private static final String dir = "data/AvailableNumbers.dat";

    @Override
    public String getDir() {
        return dir;
    }
}
