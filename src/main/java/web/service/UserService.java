package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void addUser(User user);
    User showUser(int id);
    void updateUser(int id,User userUpdated);
    void deleteUser(int id);
}
