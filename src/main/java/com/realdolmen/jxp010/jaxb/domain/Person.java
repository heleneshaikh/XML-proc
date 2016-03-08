package com.realdolmen.jxp010.jaxb.domain;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by heleneshaikh on 08/03/16.
 */

@XmlRootElement
@XmlType(propOrder = {"firstName", "lastName", "address"})

public class Person {
    private String firstName;
    private String lastName;
    private Address address;
    private List<String> email = new ArrayList<>();

    public Person() {
    }

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @XmlElement(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
