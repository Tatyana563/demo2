package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@Table(name = "COUNTRIES")
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_country")
    @SequenceGenerator(name = "seq_country", sequenceName = "seq_country", allocationSize = 1)
    private Integer id;

    @Column(name = "COUNTRY_NAME", nullable = false, insertable = true, updatable = true)
    private String name;

    @Column(name = "MOTHER_TONGUE")
    private String motherTongue;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "SQUARE")
    private double square;


    @Transient
    private Date createDate;

    public CountryEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
