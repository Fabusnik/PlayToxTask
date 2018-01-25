package ru.fab.playtoxtask.repository;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.fab.playtoxtask.model.User;

import static org.slf4j.LoggerFactory.getLogger;


@Repository
public class UserRepositoryImpl implements UserRepository{
    private static final Logger log = getLogger(UserRepositoryImpl.class);


//    @Autowired
//    private CrudUserRepository repository;

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
