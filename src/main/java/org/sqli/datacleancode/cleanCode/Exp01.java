package org.sqli.datacleancode.cleanCode;

import java.util.Date;

/**
 *
 * Consider a builder when faced with many contructors/params
 *
 */
class BookKo {
    private int id;
    private String name;
    private String isin;
    private Date date;
    private String author;
    private String publisher;

    public BookKo() {}

    public BookKo(String name, String isin) {
        this.name = name;
        this.isin = isin;
    }

    public BookKo(String name, String isin, Date date) {
        this.name = name;
        this.isin = isin;
        this.date = date;
    }

    public BookKo(String name, Date date, String publisher) {
        this.name = name;
        this.date = date;
        this.publisher = publisher;
    }

    public BookKo(int id, String name, String isin, Date date, String author, String publisher) {
        this.id = id;
        this.name = name;
        this.isin = isin;
        this.date = date;
        this.author = author;
        this.publisher = publisher;
    }

    // more constructors
}

public class Exp01 {

}
