package com.realdolmen.jxp010.jaxb.domain;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by heleneshaikh on 08/03/16.
 */
public class MovieHandler extends DefaultHandler {
    private boolean titleTag = false;
    private boolean typeTag = false;
    private boolean formatTag = false;
    private boolean isMovie = false;
    private Movie movie;
    private List<Movie> list = new ArrayList<>();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("movie")) {
            isMovie = true;
            movie = new Movie();
        }
        if (qName.equals("title")) {
            titleTag = true;
        }
        if (qName.equals("type")) {
            typeTag = true;
        }
        if (qName.equals("format")) {
            formatTag = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("movie")) {
            isMovie = false;
            list.add(movie);
        }
        if (qName.equals("title")) {
            titleTag = false;
        }
        if (qName.equals("type")) {
            typeTag = false;
        }
        if (qName.equals("format")) {
            formatTag = false;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length).trim();
        if (isMovie && titleTag) {
            movie.setTitle(value);
        }
        if (isMovie && typeTag) {
            movie.setType(value);
        }
        if (isMovie && formatTag) {
            movie.setFormat(value);
        }

    }

    public List<Movie> getList() {
        return list;
    }

    public void setList(List<Movie> list) {
        this.list = list;
    }
}
