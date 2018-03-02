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

    @Column(name = "PART1_TITLE")
    protected String part1Title;

    @Column(name = "PART1_DESCRIPTION")
    protected String part1Description;

    @Column(name = "PART1_PRICE")
    protected String part1Price;

    @Column(name = "PART2_TITLE")
    protected String part2Title;

    @Column(name = "PART2_DESCRIPTION")
    protected String part2Description;

    @Column(name = "PART2_PRICE")
    protected String part2Price;

    @Column(name = "PART3_TITLE")
    protected String part3Title;

    @Column(name = "PART3_DESCRIPTION")
    protected String part3Description;

    @Column(name = "PART3_PRICE")
    protected String part3Price;

    @Column(name = "STATUS")
    protected Integer status;

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

    public void setPart1Title(String part1Title) {
        this.part1Title = part1Title;
    }

    public String getPart1Title() {
        return part1Title;
    }

    public void setPart1Description(String part1Description) {
        this.part1Description = part1Description;
    }

    public String getPart1Description() {
        return part1Description;
    }

    public void setPart1Price(String part1Price) {
        this.part1Price = part1Price;
    }

    public String getPart1Price() {
        return part1Price;
    }

    public void setPart2Title(String part2Title) {
        this.part2Title = part2Title;
    }

    public String getPart2Title() {
        return part2Title;
    }

    public void setPart2Description(String part2Description) {
        this.part2Description = part2Description;
    }

    public String getPart2Description() {
        return part2Description;
    }

    public void setPart2Price(String part2Price) {
        this.part2Price = part2Price;
    }

    public String getPart2Price() {
        return part2Price;
    }

    public void setPart3Title(String part3Title) {
        this.part3Title = part3Title;
    }

    public String getPart3Title() {
        return part3Title;
    }

    public void setPart3Description(String part3Description) {
        this.part3Description = part3Description;
    }

    public String getPart3Description() {
        return part3Description;
    }

    public void setPart3Price(String part3Price) {
        this.part3Price = part3Price;
    }

    public String getPart3Price() {
        return part3Price;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }


}