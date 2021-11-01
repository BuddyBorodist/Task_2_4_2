package ru.buddyborodist.spring.security.service;

import ru.buddyborodist.spring.security.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser (User user);

    void deleteUserId(Long id);

    User getUserId (Long id);

    void updateUser (User user);

    User getUsername(String username);
}
