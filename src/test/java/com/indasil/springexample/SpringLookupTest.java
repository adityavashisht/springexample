package com.indasil.springexample;


import com.indasil.lookup.AutowireSlave;
import com.indasil.lookup.Slave;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vashishta on 9/14/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-lookup.xml"})
public class SpringLookupTest {

    @Autowired
    private Slave slave;

    @Autowired
    private AutowireSlave autowireSlave;

    @Test
    public void testSlave() {
        slave.slaveTask();
    }

    @Test
    public void testAutowireSlave() {
        autowireSlave.master();
    }
}
