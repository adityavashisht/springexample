package com.indasil.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by vashishta on 9/7/16.
 */
@Component
public class A {


    private B b;

    @Autowired
    public void setB(B b) {
        this.b = b;
    }

    public void checkBAlive() {
        b.execute();
    }

    public void checkViaC() {
        System.out.println("C");
    }
}
