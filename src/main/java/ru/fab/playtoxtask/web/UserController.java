package ru.fab.playtoxtask.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.fab.playtoxtask.model.User;
import ru.fab.playtoxtask.service.UserService;


@Controller
public class UserController {

    @Autowired
    private UserService service;


    public UserService getService() {
        return service;
    }

    public User get(Integer id){
        return service.get(id);
    }
}
