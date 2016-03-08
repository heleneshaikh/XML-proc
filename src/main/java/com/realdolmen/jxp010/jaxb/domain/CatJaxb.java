package com.realdolmen.jxp010.jaxb.domain;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by heleneshaikh on 08/03/16.
 */
public class CatJaxb {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Cat.class);
        Marshaller marshaller = context.createMarshaller();
        Cat cat = new Cat("Pixie", "Shaikh", "06-04-1988", "orange");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(cat, new File("./cat.xml"));
    }
}
