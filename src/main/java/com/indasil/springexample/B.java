package com.indasil.springexample;

import com.indasil.another.C;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by vashishta on 9/7/16.
 */
@Component
public class B implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void execute() {
        A a = (A) applicationContext.getBean("a");
        a.checkViaC();
    }


}
