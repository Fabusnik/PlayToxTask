package ru.fab.playtoxtask.repository.datajpa;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.fab.playtoxtask.model.User;
import ru.fab.playtoxtask.repository.UserRepository;

import static org.slf4j.LoggerFactory.getLogger;


//@Repository
public class JpaUserRepositoryImpl implements UserRepository {
    private static final Logger log = getLogger(JpaUserRepositoryImpl.class);

//    @Autowired
    CrudUserRepository repository;

    public User get(Integer id){
        log.info("get user by id {}",id);
        return null;
    }

    public User create(User user){
        log.info("save User " + user);
        return user;
    }

    public void delete(Integer id){
        log.info("user deleted {}",id);
    }
}
