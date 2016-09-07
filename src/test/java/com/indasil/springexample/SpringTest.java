package com.indasil.springexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vashishta on 9/7/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/springexample.xml"})
public class SpringTest {

    @Autowired
    private A a;

    @Test
    public void checkA() {
        a.checkBAlive();
    }

}
