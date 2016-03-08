package com.realdolmen.jxp010.jaxb.domain;

/**
 * Created by heleneshaikh on 08/03/16.
 */
public class Movie {
    private String title;
    private String format;
    private String type;

    public Movie() {
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
