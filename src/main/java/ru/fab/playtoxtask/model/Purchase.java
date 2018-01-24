package ru.fab.playtoxtask.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDateTime;



@Entity
@Table(name = "purchase")
public class Purchase extends AbstractBaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "good_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Goods goods;

    @Column(name = "data")
    private LocalDateTime dateTime;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "quantity")
    private Integer quantity;

    public Purchase(Integer id, User user, Goods goods, LocalDateTime dateTime, Integer amount, Integer quantity) {
        super(id);
        this.user = user;
        this.goods = goods;
        this.dateTime = dateTime;
        this.amount = amount;
        this.quantity = quantity;
    }
}
