package ru.fab.playtoxtask.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.fab.playtoxtask.service.UserService;


@Controller
public class UserController {

    @Autowired
    UserService service;




}
