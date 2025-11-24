package com.begin;

public class AllBooks {
    private  String Book_id ;
    private String Book_author ;
    private String Book_name ;
    private Double Book_price ;
    private String Book_edition ;
    private String Book_Isbn  ;

    public AllBooks(String Book_Isbn, String Book_author, String Book_edition, String Book_id, String Book_name, Double Book_price) {
        this.Book_Isbn = Book_Isbn;
        this.Book_author = Book_author;
        this.Book_edition = Book_edition;
        this.Book_id = Book_id;
        this.Book_name = Book_name;
        this.Book_price = Book_price;
    }

    public String getBook_id() {
        return Book_id;
    }

    public void setBook_id(String Book_id) {
        this.Book_id = Book_id;
    }

    public String getBook_author() {
        return Book_author;
    }

    public void setBook_author(String Book_author) {
        this.Book_author = Book_author;
    }

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String Book_name) {
        this.Book_name = Book_name;
    }

    public Double getBook_price() {
        return Book_price;
    }

    public void setBook_price(Double Book_price) {
        this.Book_price = Book_price;
    }

    public String getBook_edition() {
        return Book_edition;
    }

    public void setBook_edition(String Book_edition) {
        this.Book_edition = Book_edition;
    }

    public String getBook_Isbn() {
        return Book_Isbn;
    }

    public void setBook_Isbn(String Book_Isbn) {
        this.Book_Isbn = Book_Isbn;
    }

    
}
