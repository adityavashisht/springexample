package com.indasil;

/**
 * Created by vashishta on 9/12/16.
 */
public class Singleton {

    private static final Singleton singleton = new Singleton("VALUE");

    private final String variable;


    public Singleton(String value) {
       variable = value;
    }

    public Singleton get() {
        return singleton;
    }
}
