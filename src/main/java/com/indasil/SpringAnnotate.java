package com.indasil;

import com.indasil.springexample.A;
import com.indasil.springexample.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vashishta on 9/9/16.
 */
@Configuration
public class SpringAnnotate {


    @Bean
    public B b() {
        return new B();
    }



    @Bean
    public A a() {
        A a = new A();
        a.setB(b());
        return a;
    }
}
