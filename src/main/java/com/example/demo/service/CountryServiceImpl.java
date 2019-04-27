package com.example.demo.service;

import com.example.demo.dao.CountryDao;
import com.example.demo.model.CountryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    private CountryDao countryDao;

    @Override
    @Transactional
    public void createOrUpdate(CountryEntity countryEntity) {
        countryDao.save(countryEntity);
    }

    @Override
    @Transactional
    public Collection<CountryEntity> findAll() {
        return countryDao.findAll();
    }
}
