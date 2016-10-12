package com.hibernate;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

/**
 * Created by vashishta on 9/16/16.
 */

public class Person {

    private Long id;
    private String first;
    private LocalDate dateOfBirth;


    private List<Address> addressList = new ArrayList<Address>();
    private Set<PhoneNumber> phoneNumberSet = new HashSet<PhoneNumber>();

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public Set<PhoneNumber> getPhoneNumberSet() {
        return phoneNumberSet;
    }

    public void setPhoneNumberSet(Set<PhoneNumber> phoneNumberSet) {
        this.phoneNumberSet = phoneNumberSet;
    }

    public void addAddress(Address address) {
        address.setPerson(this);
        addressList.add(address);
    }

    public void addPhone(PhoneNumber number) {
        number.setPerson(this);
        phoneNumberSet.add(number);
    }

    public Date getDob() {
        return asDate(getDateOfBirth());
    }

    public static Date asDate(LocalDate localDate) {
        Date date = null;
        if (localDate != null) {
            date = Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        }

        return date;

    }
}
