package com.indasil.springexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vashishta on 9/7/16.
 */
public class SpringMainTest {

    public static void main(String [] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(new String[] {"/spring-annotation.xml"});

        A a = (A) context.getBean("a");
        B b = (B) context.getBean("b");

        b.execute();

        a.checkBAlive();
    }
}
