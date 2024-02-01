package service;

import dao.UserDAO;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO USERDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.USERDAO = userDAO;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        USERDAO.addUser(user);
    }

    @Transactional
    @Override
    public User getUser(long id) {
        return USERDAO.getUser(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        USERDAO.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        USERDAO.deleteUser(id);
    }

    @Transactional
    @Override
    public List<User> getUserList() {
        return USERDAO.getUserList();
    }
}
