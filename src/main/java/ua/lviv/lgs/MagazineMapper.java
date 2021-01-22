package ua.lviv.lgs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MagazineMapper {
    public static Magazine map(ResultSet result) throws SQLException {

        int id = result.getInt("id");
        String name_magazines = result.getString("name_magazines");
        String description = result.getString("description");
        double price = result.getDouble("price");

        return new Magazine(id, name_magazines, description,price);

    }
}
