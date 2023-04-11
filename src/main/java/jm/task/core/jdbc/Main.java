package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserService user = new UserServiceImpl();

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
