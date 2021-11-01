package ru.buddyborodist.spring.security.dao;

import org.springframework.transaction.annotation.Transactional;
import ru.buddyborodist.spring.security.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser (User user);

    void deleteUserId(Long id);

    User getUserId (Long id);

    void updateUser (User user);

    User getUsername (String username);
}
