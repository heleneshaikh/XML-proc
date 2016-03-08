package com.realdolmen.jxp010.jaxb.domain;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by heleneshaikh on 08/03/16.
 */
public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        MovieHandler handler = new MovieHandler();
        saxParser.parse(new File("src/main/movies.xml"), handler);
        List<Movie> list = handler.getList();
        for (Movie movie : list) {
            System.out.println(movie.getTitle());
        }

    }
}
