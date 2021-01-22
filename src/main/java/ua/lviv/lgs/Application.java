package ua.lviv.lgs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Application {


    public Application() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

        List<User> userList = new ArrayList<>();
        userList.add(new User("Daniel", "Kuziv", 1,"Lviv"));
        userList.add(new User("Max", "Ivanov", 2,"Kyiv"));
        userList.add(new User("Roman", "Danil", 3,"Dnipro"));
        userList.add(new User("Ihor", "Kaka", 4,"Kharkiv"));
        userList.add(new User("Mark", "Rash", 5,"Boryslav"));

        UserDao userDao = new UserDao(ConnectionUtils.openConnection());
//          INSERT
//        userList.forEach(user -> {
//            try{
//                userDao.insert(user);
//            }catch (SQLException e){
//                e.printStackTrace();
//            }
//        });
//          READ ALL
//        userDao.readAll().forEach(System.out::println);
        //READ BY ID
//        System.out.println(userDao.read(2));
//        User userBD = userDao.read(2);
//        userBD.setAdress("Poltava");
//        userDao.update(userBD);
//        System.out.println(userBD);
//        userDao.delete(2);
//        userDao.readAll().forEach(System.out::println);

        MagazineDao magazineDao = new MagazineDao(ConnectionUtils.openConnection());
        List<Magazine> magazineList = new ArrayList<>();
        magazineList.add(new Magazine("Logos","Text",12.12));
        magazineList.add(new Magazine("IT","Text",19.06));
        magazineList.add(new Magazine("WEB","Text",111.11));
        magazineList.add(new Magazine("Front","Text",243.43));
        magazineList.add(new Magazine("Back","Text",133.33));

//        magazineList.forEach(magazine -> {
//            try {
//                magazineDao.insert(magazine);
//            }catch (SQLException e){
//                e.printStackTrace();
//            }
//        });
//       magazineDao.readAll().forEach(System.out::println);
//       System.out.println(magazineDao.read(1));
//        Magazine magazineBD = magazineDao.read(2);
//        magazineBD.setPrice(33.33);
//        magazineDao.update(magazineBD);
//        System.out.println(magazineDao.read(2));
        magazineDao.delete(5);


    }


}
