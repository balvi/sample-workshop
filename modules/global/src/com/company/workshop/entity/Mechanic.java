package com.company.workshop.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.security.entity.User;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.List;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@NamePattern("%s|user")
@Table(name = "WORKSHOP_MECHANIC")
@Entity(name = "workshop$Mechanic")
public class Mechanic extends StandardEntity {
    private static final long serialVersionUID = 4167246151086798403L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    protected User user;

    @Column(name = "HOURLY_RATE", nullable = false)
    protected BigDecimal hourlyRate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    protected Order order;


    @JoinTable(name = "WORKSHOP_ORDER_INPUT_OBJECT_MECHANIC_LINK",
        joinColumns = @JoinColumn(name = "MECHANIC_ID"),
        inverseJoinColumns = @JoinColumn(name = "ORDER_INPUT_OBJECT_ID"))
    @ManyToMany
    protected List<OrderInputObject> orderInputObjects;

    public void setOrderInputObjects(List<OrderInputObject> orderInputObjects) {
        this.orderInputObjects = orderInputObjects;
    }

    public List<OrderInputObject> getOrderInputObjects() {
        return orderInputObjects;
    }


    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }


}