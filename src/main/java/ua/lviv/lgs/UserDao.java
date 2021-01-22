package ua.lviv.lgs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    static String READ_ALL = "select * from user";
    static String CREATE = "insert user(first_name, last_name, number_phone,adress) values(?,?,?,?)";
    static String READ_BY_ID = "select * from user where id=?";
    static String UPDATE_BY_ID = "update user set first_name=?, last_name=? where id=?";
    static String DELETE_BY_ID = "delete from user where id=?";

    private Connection connection;
    private PreparedStatement preparedStatement;

    public UserDao(Connection connection) {
        this.connection = connection;
    }

    public void insert(User user) throws SQLException {
        preparedStatement = connection.prepareStatement(CREATE);
        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setInt(3, user.getNumber_phone());
        preparedStatement.setString(4, user.getAdress());
        preparedStatement.executeUpdate();
    }

    public User read(int id) throws SQLException {
        preparedStatement = connection.prepareStatement(READ_BY_ID);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return UserMapper.map(resultSet);
    }

    public void update(User user) throws SQLException {
        preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setInt(3, user.getId());
        preparedStatement.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        preparedStatement = connection.prepareStatement(DELETE_BY_ID);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    public List<User> readAll() throws SQLException {
        List<User> userList = new ArrayList<>();
        preparedStatement = connection.prepareStatement(READ_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            userList.add(UserMapper.map(resultSet));
        }
        return userList;
    }

}
