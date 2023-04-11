package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        //Создать таблицу
        userService.createUsersTable();

        //Добавить 4 юзера с данными. Вывод в консоль по каждому юзеру.
        userService.saveUser("Stas", "Popov", (byte) 27);
        userService.saveUser("Katya", "Valyshkina", (byte) 23);
        userService.saveUser("Tanya", "Plotkina", (byte) 24);
        userService.saveUser("Valentin", "Lazy", (byte) 27);

        //Удалить юзера по ИД
        userService.removeUserById(2);

        //Вывести список юзеров. Вывод юзеров в консоль.
        userService.getAllUsers();

        //Очистить таблицу
        userService.cleanUsersTable();

        //Удалить таблицу
        userService.dropUsersTable();
    }
}
