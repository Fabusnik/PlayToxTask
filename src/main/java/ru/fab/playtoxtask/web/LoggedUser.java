package ru.fab.playtoxtask.web;

import ru.fab.playtoxtask.model.Role;

import java.util.Collections;
import java.util.Set;

public class LoggedUser {
    protected int id = 0;
    protected Set<Role> roles = Collections.singleton(Role.ROLE_USER);

    private static LoggedUser LOGGED_USER = new LoggedUser();

    public static LoggedUser get(){
        return LOGGED_USER;
    }

    public static int id(){
        return get().id;
    }

    public Set<Role> getAuthorities(){
        return roles;
    }
}
