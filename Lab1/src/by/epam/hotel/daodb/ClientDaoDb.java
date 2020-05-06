package by.epam.hotel.daodb;

import by.epam.hotel.entity.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDaoDb extends daodb<Client> {
    {
        setTableName("Client");
        setInsertSql("INSERT INTO Client " +
                "(name, passwordHash, login, email, nickname)" +
                "VALUES(?,?,?,?,?)");
        setDeleteSql("DELETE FROM flight WHERE Client_id = ");
    }
    @Override
    public String makeUpdateQuery(Client client) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE Client");
        stringBuilder.append("name= '").append(client.getName()).append("',");
        stringBuilder.append("PasswordHash= '").append(client.getPasswordHash()).append("',");
        stringBuilder.append("login= '").append(client.getLogin()).append("',");
        stringBuilder.append("nickname= '").append(client.getNickname()).append("',");
        stringBuilder.append("email= '").append(client.getEmail()).append("',");
        stringBuilder.append("WHERE Client_id = '").append(client.getId()).append("'");
        return stringBuilder.toString();
    }

    @Override
    public PreparedStatement prepareInsert(PreparedStatement preparedStatement, Client client) {
        try {
            preparedStatement.setString(1, client.getName());
            preparedStatement.setInt(2, client.getId());
            preparedStatement.setString(3, client.getPasswordHash());
            preparedStatement.setString(4, client.getEmail());
            preparedStatement.setString(5, client.getLogin());
            preparedStatement.setString(6, client.getNickname());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    public Client makeEntity(ResultSet sqlResponse) {
        Client client = new Client();
        try {
            client.setId(sqlResponse.getInt("client_id"));
            client.setName(sqlResponse.getString("name"));
            client.setPasswordHash(sqlResponse.getString("passwordHash"));
            client.setLogin(sqlResponse.getString("login"));
            client.setNickname(sqlResponse.getString("nickname"));
            client.setEmail(sqlResponse.getString("email"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }
}
