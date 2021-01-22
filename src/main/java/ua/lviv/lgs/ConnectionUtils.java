package ua.lviv.lgs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    private static String USER_NAME = "magazines";
    private static String USER_PASSWORD = "1111";
    private static String URL = "jdbc:mysql://localhost:3306/magazines";

    public static Connection openConnection() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        return DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
    }

}
