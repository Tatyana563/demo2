package com.example.demo.dao;

import com.example.demo.model.CityEntity;

import java.util.Collection;

public interface CityDao {
    void save(CityEntity city);
        Collection<CityEntity> finAll();
}
