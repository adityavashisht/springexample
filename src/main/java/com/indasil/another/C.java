package com.indasil.another;

import com.indasil.springexample.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;

/**
 * Created by vashishta on 9/7/16.
 */
@Component
public class C {

    @Autowired
    private A a;



    public void checkBAlive() {
        a.checkBAlive();
    }

    @PostConstruct  // InitializingBean interface
    public void init() {
        Assert.notNull(a);
    }


}
