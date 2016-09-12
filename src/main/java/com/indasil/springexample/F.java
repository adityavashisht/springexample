package com.indasil.springexample;

/**
 * Created by vashishta on 9/12/16.
 */
public class F {

    private A a; // collaborator
    private B b; // collaborator

    public F(A a, B b) {
        this.a = a;
        this.b = b;
    }
}
