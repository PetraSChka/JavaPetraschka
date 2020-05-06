package by.epam.hotel.daodb;

import by.epam.hotel.entity.AvailableNumbers;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AvailableNumbersDaoDb extends daodb<AvailableNumbers> {
    {
        setTableName("AvailableNumbers");
        setInsertSql("INSERT INTO AvailableNumbers " +
                "(numberPackages, classApartament, date, cost)" +
                "VALUES(?,?,?,?)");
        setDeleteSql("DELETE FROM flight WHERE AvailableNumbers_id = ");
    }
    @Override
    public String makeUpdateQuery(AvailableNumbers availableNumbers) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE AvailableNumbers");
        stringBuilder.append("numberPackages = '").append(availableNumbers.getNumberPackages()).append("',");
        stringBuilder.append("classApartament= '").append(availableNumbers.getClassApartament()).append("',");
        stringBuilder.append("date = '").append(availableNumbers.getDate()).append("',");
        stringBuilder.append("cost = '").append(availableNumbers.getCost()).append("',");
        stringBuilder.append("WHERE ApplicationForm_id = '").append(availableNumbers.getId()).append("'");
        return stringBuilder.toString();
    }

    @Override
    public PreparedStatement prepareInsert(PreparedStatement preparedStatement, AvailableNumbers availableNumbers) {
        try {
            preparedStatement.setInt(1, availableNumbers.getNumberPackages());
            preparedStatement.setInt(2, availableNumbers.getId());
            preparedStatement.setString(3, availableNumbers.getClassApartament());
            preparedStatement.setDate(4, (Date)availableNumbers.getDate());
            preparedStatement.setInt(5, availableNumbers.getCost());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    public AvailableNumbers makeEntity(ResultSet sqlResponse) {
        AvailableNumbers availableNumbers = new AvailableNumbers();
        try {
            availableNumbers.setId(sqlResponse.getInt("aplicationForm_id"));
            availableNumbers.setCost(sqlResponse.getInt("cost"));
            availableNumbers.setNumberPackages(sqlResponse.getInt("aplicationForm_id"));
            availableNumbers.setDate(sqlResponse.getDate("Date"));
            availableNumbers.setClassApartament(sqlResponse.getString("classApartament"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return availableNumbers;
    }
}
