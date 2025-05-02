package com.borax;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book>books;
    public Library(){
        books=new ArrayList<>();
    }

        public void addBook(String title,String auther){
        books.add(new Book(title,auther));
            System.out.println("Book has Added");
            return ;
        }
        public void viewBook(){
        if(books.isEmpty()){
            System.out.println("No book is available");
            return;
        }
        for(Book book:books){
            System.out.println(book);
        }
        }
        public void borrowBook(String title){
        for(Book book:books){
            if(book.getTitle().equalsIgnoreCase(title)){
                if(!book.isBorrowed()){
                    book.bookBorrow();
                    System.out.println("You have borrow book");
                    return;
                }
                else {
                    System.out.println("Book is already borrowed");
                    return;
                }
            }
        }
            System.out.println("Book not found");
        }
        public void returnBook(String title){
        for(Book book:books){
            if(book.getTitle().equalsIgnoreCase(title)){
            if(book.isBorrowed()){
                book.bookReturn();
                System.out.println("You have return book");
                return;
            }
            else {
                System.out.println("This book wasn't borrow");
                return;
            }
            }
        }
            System.out.println("This book is not found");
        }
}
