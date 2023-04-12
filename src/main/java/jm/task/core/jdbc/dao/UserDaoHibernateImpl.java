package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;

import java.util.List;

public class UserDaoHibernateImpl extends Util implements UserDao {
    public UserDaoHibernateImpl() {

    }


    @Override
    public void createUsersTable() {
        String sql = """
                create table if not exists `java_pre_project_1`.`users` (
                  `id` INT NOT NULL AUTO_INCREMENT,
                  `name` VARCHAR(45) NOT NULL,
                  `lastname` VARCHAR(45) NOT NULL,
                  `age` INT NOT NULL,
                  PRIMARY KEY (`id`))
                ENGINE = InnoDB
                DEFAULT CHARACTER SET = utf8;""";
        try (Session session = getSessionFactory().openSession()){
            session.beginTransaction();
            session.createQuery(sql);
            session.getTransaction().commit();
            getSessionFactory().close();
        }
    }

    @Override
    public void dropUsersTable() {

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {

    }

    @Override
    public void removeUserById(long id) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void cleanUsersTable() {

    }
}
