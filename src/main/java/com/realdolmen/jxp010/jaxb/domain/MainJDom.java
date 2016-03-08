package com.realdolmen.jxp010.jaxb.domain;

import org.jdom2.Element;

/**
 * Created by heleneshaikh on 08/03/16.
 */
public class MainJDom {
    public static void main(String[] args) {
       Element element = new MovieElement("The Lord of the Rings", "DVD", "adventure");
       Element element2 = new MovieElement("Into the wild", "DVD", "biography");
       Element element3 = new MovieElement("Friends", "DVD", "Series");


    }
}

class MovieElement extends Element {
    public MovieElement(String title, String format, String type) {
        addContent(new Element("title").setText(title));
        addContent(new Element("format").setText(format));
        addContent(new Element("type").setText(type));
    }
}
