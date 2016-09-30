package com.hibernate;


import com.hibernate.mapping.Honda;
import com.hibernate.mapping.Toyota;
import com.hibernate.mapping.Vehicle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.List;


/**
 * Created by vashishta on 9/14/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/hibernate.xml"})
@Transactional
public class MappingTreeHibernateTest {

    @Autowired
    private PersonHibernateService personHibernateService;


    @Test
    @Rollback(false)
    public void createVehicle() {

        Honda honda = new Honda();
        honda.setVin("12122343242342");
        honda.setModel("CRV");
        honda.setYear("2016");


        personHibernateService.create(honda);

        Toyota toyota = new Toyota();
        toyota.setModel("Camry");
        toyota.setYear("2016");
        toyota.setVin("23234323534543");

        personHibernateService.create(toyota);
    }

    @Test
    public void testGet() {
        Vehicle vehicle = personHibernateService.getVehicleById(1L);
        Assert.notNull(vehicle);
    }


}
