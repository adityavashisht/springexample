package com.indasil.lookup;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by vashishta on 9/14/16.
 */
public class Slave implements ApplicationContextAware {



    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     *
     */
    public void slaveTask() {
        Master master = (Master) applicationContext.getBean("master");
        master.masterTask();
    }


}
