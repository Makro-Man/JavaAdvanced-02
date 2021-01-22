package ua.lviv.lgs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper {

    public static User map(ResultSet result) throws SQLException {

        int id = result.getInt("id");
        String first_name = result.getString("first_name");
        String last_name = result.getString("last_name");
        int number_phone = result.getInt("number_phone");
        String adress = result.getString("adress");

        return new User(id, first_name, last_name, number_phone, adress);

    }

}
