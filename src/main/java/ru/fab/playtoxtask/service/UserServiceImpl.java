package ru.fab.playtoxtask.service;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.fab.playtoxtask.model.User;
import ru.fab.playtoxtask.repository.UserRepository;
import ru.fab.playtoxtask.repository.datajpa.CrudUserRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {


    private final CrudUserRepository repository;

    @Inject
    public UserServiceImpl(CrudUserRepository repository) {
        this.repository = repository;
    }

    public User get(Integer id) {
        return repository.findById(id).orElse(null);
    }


    public void delete(Integer id) {

    }


    public List<User> getAll() {
        return null;
    }


    public User save(User user) {
        return null;
    }


    public void update(User user) {

    }
}
