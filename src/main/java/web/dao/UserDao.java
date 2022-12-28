package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();
    void addUser(User user);
    User showUser(int id);
    void updateUser(int id,User userUpdated);
    void deleteUser(int id);
}
