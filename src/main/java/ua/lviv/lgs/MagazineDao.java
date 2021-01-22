package ua.lviv.lgs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MagazineDao {
    static String READ_ALL = "select * from magazine";
    static String CREATE = "insert magazine(name_magazines,description,price) values (?,?,?)";
    static String READ_BY_ID = "select * from magazine where id=?";
    static String UPDATE_BY_ID = "update magazine set name_magazines=?,description=?,price=? where id=?";
    static String DELETE_BY_ID = "delete from magazine where id=?";

    private Connection connection;
    private PreparedStatement preparedStatement;

    public MagazineDao(Connection connection) {
        this.connection = connection;
    }

    public void insert(Magazine magazine) throws SQLException {
        preparedStatement = connection.prepareStatement(CREATE);
        preparedStatement.setString(1, magazine.getName());
        preparedStatement.setString(2, magazine.getDescription());
        preparedStatement.setDouble(3, magazine.getPrice());
        preparedStatement.executeUpdate();
    }

    public Magazine read(int id) throws SQLException {
        preparedStatement = connection.prepareStatement(READ_BY_ID);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return MagazineMapper.map(resultSet);
    }

    public void update(Magazine magazine) throws SQLException {
        preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
        preparedStatement.setString(1, magazine.getName());
        preparedStatement.setString(2, magazine.getDescription());
        preparedStatement.setDouble(3, magazine.getPrice());
        preparedStatement.setInt(4, magazine.getId());
        preparedStatement.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        preparedStatement = connection.prepareStatement(DELETE_BY_ID);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    public List<Magazine> readAll() throws SQLException {
        List<Magazine> magazineList = new ArrayList<>();
        preparedStatement = connection.prepareStatement(READ_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            magazineList.add(MagazineMapper.map(resultSet));
        }
        return magazineList;
    }
}
