package ru.fab.playtoxtask.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "name", name = "name_UNIQUE")})
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

    @CollectionTable(name = "purchase", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "id")
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Purchase> purchases;

    public User() {
    }

    public User(Integer id, String name, String password, Set<Role> roles, Set<Purchase> purchases) {
        super(id);
        this.name = name;
        this.password = password;
        this.roles = roles;
        this.purchases = purchases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
