package com.realdolmen.jxp010.jaxb.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by heleneshaikh on 08/03/16.
 */
@XmlRootElement
public class Cat {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String colour;

    public Cat() {

    }

    public Cat(String firstName, String lastName, String birthDate, String colour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.colour = colour;
    }

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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
