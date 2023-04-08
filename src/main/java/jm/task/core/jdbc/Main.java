package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        Util util = new Util();
        util.getConnection();

        //Создать таблицу
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();

        //Добавить 4 юзера с данными. Вывод в консоль по каждому юзеру.
        userDaoJDBC.saveUser("Stas", "Popov", (byte) 27);
        userDaoJDBC.saveUser("Katya", "Valyshkina", (byte) 23);
        userDaoJDBC.saveUser("Tanya", "Plotkina", (byte) 24);
        userDaoJDBC.saveUser("Valentin", "Lazy", (byte) 27);

        //Удалить юзера по ИД
        userDaoJDBC.removeUserById(2);

        //Вывести список юзеров. Вывод юзеров в консоль.
        List<User> userList = userDaoJDBC.getAllUsers();
        for (User u : userList) {
            System.out.println(u);
        }

        //Очистить таблицу
        userDaoJDBC.cleanUsersTable();

        //Удалить таблицу
        userDaoJDBC.dropUsersTable();
    }
}
