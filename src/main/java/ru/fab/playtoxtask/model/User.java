package ru.fab.playtoxtask.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = "name", name = "name_UNIQUE")})
public class User extends AbstractBaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role")
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;

    public User(Integer id, String name, String password, Set<Role> roles) {
        super(id);
        this.name = name;
        this.password = password;
        this.roles = roles;
    }
}
