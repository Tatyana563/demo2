package com.example.demo;

import com.example.demo.dao.CountryDao;
import com.example.demo.model.CountryEntity;
import com.example.demo.service.CountryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private CountryService countryService;

	@Test
	public void contextLoads() {
		final CountryEntity countryEntity = new CountryEntity();
		countryEntity.setName("Russia");
		countryEntity.setMotherTongue("RU");
		countryEntity.setCurrency("RUB");
		countryService.createOrUpdate(countryEntity);


		System.out.println();
	}

}
