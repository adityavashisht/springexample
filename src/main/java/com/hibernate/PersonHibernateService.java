package com.hibernate;

import com.hibernate.mapping.Vehicle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by vashishta on 9/21/16.
 */
@Service
@Transactional
public class PersonHibernateService {

    private static final Logger logger = LogManager.getLogger(PersonHibernateService.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void createPerson(Person p) {
        Session session = sessionFactory.getCurrentSession();
        session.save(p);
        logger.info("Done saving person...");

        if (logger.isDebugEnabled()) {
            logger.debug("I am on DEGUG Mode");
        }

        if(logger.isInfoEnabled()) {
            logger.info("Check INFO..");
        }
    }

    /**
     *
     * @param id
     * @return
     */
    public Person getById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Person p = session.load(Person.class, id);
        Hibernate.initialize(p);

        return p;

    }


    /**
     *
     * @param vehicle
     */
    public void create(Vehicle vehicle) {
        sessionFactory.getCurrentSession().saveOrUpdate(vehicle);
    }


    /**
     *
     * @param id
     * @return
     */
    public Vehicle getVehicleById(Long id) {
        return sessionFactory.getCurrentSession().load(Vehicle.class, id);
    }
}
