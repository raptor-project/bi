package com.raptor.raptorexpect.Models;

import java.io.Serializable;

public class QuotesData implements Serializable {
    private String quotes;
    private String author;
    public QuotesData(String quotes,String author){
        this.quotes = quotes;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }
}


