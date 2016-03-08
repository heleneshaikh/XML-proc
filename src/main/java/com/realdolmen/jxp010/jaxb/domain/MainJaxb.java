package com.realdolmen.jxp010.jaxb.domain;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by heleneshaikh on 08/03/16.
 */
public class MainJaxb {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Address.class, Person.class);
        Marshaller marshaller = context.createMarshaller();

        Address address = new Address("Huizingen", "123", "45", "Oude Leuvensebaan");
        Person person = new Person("Helene", "Shaikh", address);

        marshaller.marshal(person,new File("./address2.xml"));
      //  marshaller.marshal(person, System.out);
    }
}
