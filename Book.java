package com.borax;

public class Book {
    private String title;
    private String auther;
    private boolean isBorrowed;

    public Book(String title,String auther){
        this.title=title;
        this.auther=auther;
        this.isBorrowed=false;

    }
    public String getTitle(){
        return title;
    }
    public String getAuther(String auther){
        return auther;
    }
    public boolean isBorrowed(){
        return isBorrowed;
    }
    public void bookBorrow(){
        isBorrowed =true;
    }
    public void bookReturn(){
        isBorrowed=false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", auther='" + auther + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
