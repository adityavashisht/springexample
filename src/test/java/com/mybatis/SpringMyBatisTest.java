package com.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by vashishta on 9/16/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class SpringMyBatisTest {


    @Autowired
    private PersonMapper personMapper;


    @Test
    public void testPersonById() {
        Person p = personMapper.getById(1L);
        Assert.notNull(p);
    }


    @Test
    public void testNewPerson() {
        Person p = new Person();
        p.setFirst("Kiran");
        personMapper.newPerson(p);

    }


}
