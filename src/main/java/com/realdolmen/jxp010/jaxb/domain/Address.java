package com.realdolmen.jxp010.jaxb.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by heleneshaikh on 08/03/16.
 */
@XmlType(propOrder = {"street", "number", "postalCode", "city"})

public class Address {

    private String city;
    private String postalCode;
    private String number;
    private String street;

    public Address() {

    }

    public Address(String city, String postalCode, String number, String street) {
        this.city = city;
        this.postalCode = postalCode;
        this.number = number;
        this.street = street;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


}
