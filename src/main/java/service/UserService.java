package service;

import model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    User getUser(long id);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getUserList ();
}
