package com.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by vashishta on 9/14/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-jdbc.xml"})
public class SpringJdbcTest {

    @Autowired
    private PersonService personService;

    @Autowired
    @Qualifier("personNamedService")
    private PersonNamedParameterService personNamedParameterService;


    @Test
    public void getById() {
        String name = personService.getPerson(1L);
        System.out.println(name);
        Assert.notNull(name);
    }

    @Test
    public void getByIdNamedParameter() {
        Person p = personNamedParameterService.getPerson(1L);
        System.out.println(p.getFirstName());

    }
}
