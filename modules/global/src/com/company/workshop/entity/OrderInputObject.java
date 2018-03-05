package com.company.workshop.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@NamePattern("%s|description")
@Table(name = "WORKSHOP_ORDER_INPUT_OBJECT")
@Entity(name = "workshop$OrderInputObject")
public class OrderInputObject extends StandardEntity {
    private static final long serialVersionUID = 2682584858210310797L;

    @Column(name = "DESCRIPTION")
    protected String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INVOICE_RECIPIENT_ID")
    protected Client invoiceRecipient;

    @Column(name = "INVOICE_TOTAL")
    protected Double invoiceTotal;

    @Column(name = "INVOICE_BILLER")
    protected String invoiceBiller;

    @Column(name = "MECHANICS_COUNT")
    protected Integer mechanicsCount;

    @Column(name = "CLIENT_COUNTS")
    protected Integer clientCounts;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "orderInputObject")
    protected List<Client> client;

    @JoinTable(name = "WORKSHOP_ORDER_INPUT_OBJECT_MECHANIC_LINK",
        joinColumns = @JoinColumn(name = "ORDER_INPUT_OBJECT_ID"),
        inverseJoinColumns = @JoinColumn(name = "MECHANIC_ID"))
    @ManyToMany
    @OnDelete(DeletePolicy.CASCADE)
    protected List<Mechanic> mechanics;

    @Column(name = "HOURS_SPENT")
    protected Integer hoursSpent;

    @Column(name = "AMOUNT")
    protected BigDecimal amount;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PART1_ID")
    protected SparePart part1;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PART2_ID")
    protected SparePart part2;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PART3_ID")
    protected SparePart part3;

    @Column(name = "STATUS")
    protected Integer status;

    public void setPart1(SparePart part1) {
        this.part1 = part1;
    }

    public SparePart getPart1() {
        return part1;
    }

    public void setPart2(SparePart part2) {
        this.part2 = part2;
    }

    public SparePart getPart2() {
        return part2;
    }

    public void setPart3(SparePart part3) {
        this.part3 = part3;
    }

    public SparePart getPart3() {
        return part3;
    }


    public Client getInvoiceRecipient() {
        return invoiceRecipient;
    }

    public void setInvoiceRecipient(Client invoiceRecipient) {
        this.invoiceRecipient = invoiceRecipient;
    }



    public void setInvoiceTotal(Double invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    public Double getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceBiller(String invoiceBiller) {
        this.invoiceBiller = invoiceBiller;
    }

    public String getInvoiceBiller() {
        return invoiceBiller;
    }


    public void setMechanicsCount(Integer mechanicsCount) {
        this.mechanicsCount = mechanicsCount;
    }

    public Integer getMechanicsCount() {
        return mechanicsCount;
    }


    public void setClientCounts(Integer clientCounts) {
        this.clientCounts = clientCounts;
    }

    public Integer getClientCounts() {
        return clientCounts;
    }


    public void setClient(List<Client> client) {
        this.client = client;
    }

    public List<Client> getClient() {
        return client;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setHoursSpent(Integer hoursSpent) {
        this.hoursSpent = hoursSpent;
    }

    public Integer getHoursSpent() {
        return hoursSpent;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }


}