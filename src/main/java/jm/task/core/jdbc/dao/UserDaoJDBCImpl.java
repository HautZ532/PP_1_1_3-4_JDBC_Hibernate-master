package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class UserDaoJDBCImpl extends Util implements UserDao {
    Connection connection = getConnection();
    public UserDaoJDBCImpl() {

    }

    //Создание таблицы
    public void createUsersTable() {
        String sql = "CREATE TABLE 'java_pre_project_1'.'user_table'('name' VARCHAR(45) NOT NULL, 'lastname' VARCHAR(45) NOT NULL, 'age' INT NOT NULL";

    }

    //Удаление таблицы
    public void dropUsersTable() {

    }

    //Добавление юзера
    public void saveUser(String name, String lastName, byte age) {
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO USER_TABLE (name, lastname, age) VALUES(?, ?, ?)";

    }

    //Удаление юзера по ид
    public void removeUserById(long id) {

    }

    //Получение списка юзеров
    public List<User> getAllUsers() {
        return null;
    }

    //Очистка таблицы
    public void cleanUsersTable() {

    }
}
