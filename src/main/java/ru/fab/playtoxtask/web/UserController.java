package ru.fab.playtoxtask.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.fab.playtoxtask.service.UserService;


@Controller
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    public UserService getService() {
        return service;
    }
}
