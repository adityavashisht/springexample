package com.indasil.springexample;

import com.indasil.SpringAnnotate;
import com.indasil.another.C;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vashishta on 9/7/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {SpringAnnotate.class})
public class SpringAnnotationTest {

    @Autowired
    private A a;


    @Autowired
    private B b;

    @Test
    public void checkA() {
        a.checkBAlive();
    }



    @Test
    public void checkB() {
        b.execute();
    }

}
