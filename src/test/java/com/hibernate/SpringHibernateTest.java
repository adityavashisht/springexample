package com.hibernate;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by vashishta on 9/14/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/hibernate.xml"})
@Transactional
public class SpringHibernateTest {

    @Autowired
    private PersonHibernateService personHibernateService;


    @Test
    @Rollback(false)
    public void createPersonTest() {
        Person p = new Person();
        p.setFirst("ADitya");


        Address address = new Address();
        address.setAddressType(AddressType.HOME);
        address.setCity("Ashburn");
        address.setPerson(p);
        address.setStreet("ABC Street");

        p.addAddress(address);


        Address addressTwo = new Address();
        addressTwo.setAddressType(AddressType.OFFICE);
        addressTwo.setCity("Chantilly");
        addressTwo.setPerson(p);
        addressTwo.setStreet("ABC Lane One");

        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setNumber("121212121");

        p.addPhone(phoneNumber);

        PhoneNumber another = new PhoneNumber();
        another.setNumber("233434343");

        p.addPhone(another);

        p.addAddress(addressTwo);





        personHibernateService.createPerson(p);
    }





}
