package com.realdolmen.jxp010.jaxb.domain;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

/**
 * Created by heleneshaikh on 08/03/16.
 */
public class MainDom {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = factory.newDocumentBuilder();

        Document document = db.parse(new File("src/main/movies.xml"));
        addMovie("Into the Wild", "adventure", "test", document);
        NodeList nodeList = document.getElementsByTagName("movie"); //niet in AL duwen, bestaat niet in JS enz
        //nodelist not iterable
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element movieElement = (Element) nodeList.item(i);
            String title = movieElement.getElementsByTagName("title").item(0).getTextContent();
            String type = movieElement.getElementsByTagName("type").item(0).getTextContent();
            String format = movieElement.getElementsByTagName("format").item(0).getTextContent();
            System.out.println("Title = " + title.trim());
            System.out.println("Type = " + type.trim());
            System.out.println("Format = " + format.trim());

        }

        //TRAX API, p 136
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.transform(new DOMSource(document), new StreamResult(new File("./output.xml")));

    }

    private static void addMovie(String title, String type, String format, Document docnode) {
        Element movieElement = docnode.createElement("movie");
        Element titleElement = docnode.createElement("title");
        titleElement.setTextContent(title);
        Element typeElement = docnode.createElement("type");
        typeElement.setTextContent(type);
        Element formatElement = docnode.createElement("format");
        formatElement.setTextContent(format);
        movieElement.appendChild(titleElement);
        movieElement.appendChild(typeElement);
        movieElement.appendChild(formatElement);


    }

}
