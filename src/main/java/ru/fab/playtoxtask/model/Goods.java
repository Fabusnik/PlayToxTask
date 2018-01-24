package ru.fab.playtoxtask.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "goods")
public class Goods extends AbstractBaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Integer price;

    @Column(name = "stock")
    private Integer stock;

    public Goods(Integer id, String name, String description, Integer price, Integer stock) {
        super(id);
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }
}
