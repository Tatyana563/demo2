package com.example.demo.dao;

import com.example.demo.model.CountryEntity;

import java.util.Collection;

public interface CountryDao {

    void save(CountryEntity country);
    Collection<CountryEntity> findAll();
}
