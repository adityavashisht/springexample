package com.hibernate.listener;

import org.hibernate.HibernateException;
import org.hibernate.event.spi.LoadEvent;
import org.hibernate.event.spi.LoadEventListener;
import org.springframework.stereotype.Component;

/**
 * Created by vashishta on 9/27/16.
 */
@Component
public class EntityLoadListener implements LoadEventListener {

    public void onLoad(LoadEvent event, LoadType loadType) throws HibernateException {
        Object entity = event.getInstanceToLoad();
        System.out.println(entity);
    }
}
