package by.epam.hotel.daodb;

import by.epam.hotel.entity.ApplicationForm;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AplicationFormDaoDb extends daodb<ApplicationForm> {
    {
        setTableName("ApplicationForm");
        setInsertSql("INSERT INTO ApplicationForm " +
                "(numberPackages, classApartament, date)" +
                "VALUES(?,?,?)");
        setDeleteSql("DELETE FROM flight WHERE ApplicationForm_id = ");
    }
    @Override
    public String makeUpdateQuery(ApplicationForm applicationForm) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE ApplicationForm");
        stringBuilder.append("numberPackages = '").append(applicationForm.getNumberPackages()).append("',");
        stringBuilder.append("classApartament= '").append(applicationForm.getClassApartament()).append("',");
        stringBuilder.append("date = '").append(applicationForm.getDate()).append("',");
        stringBuilder.append("WHERE ApplicationForm_id = '").append(applicationForm.getId()).append("'");
        return stringBuilder.toString();
    }

    @Override
    public PreparedStatement prepareInsert(PreparedStatement preparedStatement, ApplicationForm applicationForm) {
        try {
            preparedStatement.setInt(1, applicationForm.getNumberPackages());
            preparedStatement.setInt(2, applicationForm.getId());
            preparedStatement.setString(3, applicationForm.getClassApartament());
            preparedStatement.setDate(4, (Date)applicationForm.getDate());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    public ApplicationForm makeEntity(ResultSet sqlResponse) {
        ApplicationForm applicationForm = new ApplicationForm();
        try {
            applicationForm.setId(sqlResponse.getInt("aplicationForm_id"));
            applicationForm.setNumberPackages(sqlResponse.getInt("NumberPackages"));
            applicationForm.setDate(sqlResponse.getDate("Date"));
            applicationForm.setClassApartament(sqlResponse.getString("classApartament"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return applicationForm;
    }
}