package ru.fab.playtoxtask.service;

import ru.fab.playtoxtask.model.User;

import java.util.List;


public interface UserService {
    User get(Integer id);

    void delete(Integer id);

    List<User> getAll();

    User save(User user);

    void update(User user);
}
