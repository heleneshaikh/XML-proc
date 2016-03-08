package com.realdolmen.jxp010.jaxb.domain;

import com.realdolmen.movies.*;
import com.realdolmen.movies.Movie;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Created by heleneshaikh on 08/03/16.
 */
public class JaxMain {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("com.realdolmen.movies");
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Movies movies = new Movies();
        Movie movie = new Movie();
        movie.setFormat("fmt");
        movie.setTitle("tit");
        movie.setType("type");
        movies.getMovie().add(movie);
        marshaller.marshal(movies, System.out);
    }
}
