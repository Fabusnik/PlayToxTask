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

    public Purchase() {
    }

    public Purchase(Integer id, User user, Goods goods, LocalDateTime dateTime, Integer amount, Integer quantity) {
        super(id);
        this.user = user;
        this.goods = goods;
        this.dateTime = dateTime;
        this.amount = amount;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "user=" + user +
                ", goods=" + goods +
                ", dateTime=" + dateTime +
                ", amount=" + amount +
                ", quantity=" + quantity +
                '}';
    }
}
