package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        UserServiceImpl user = new UserServiceImpl();

        //Создать таблицу
        user.createUsersTable();

        //Добавить 4 юзера с данными. Вывод в консоль по каждому юзеру.
        user.saveUser("Stas", "Popov", (byte) 27);
        user.saveUser("Katya", "Valyshkina", (byte) 23);
        user.saveUser("Tanya", "Plotkina", (byte) 24);
        user.saveUser("Valentin", "Lazy", (byte) 27);

        //Удалить юзера по ИД
        user.removeUserById(2);

        //Вывести список юзеров. Вывод юзеров в консоль.
        for (User u : user.getAllUsers()) {
            System.out.println(u);
        }

        //Очистить таблицу
        user.cleanUsersTable();

        //Удалить таблицу
        user.dropUsersTable();
    }
}
