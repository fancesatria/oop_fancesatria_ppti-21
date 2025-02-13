/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.util.*;
/**
 *
 * @author fance
 */
class Library {
    public ArrayList<Book> book = new ArrayList<>();

    void addBook(Book newBook) {
        book.add(newBook);
        System.out.println("Book added to library: "+newBook.getTitle());
        System.out.println("=========================================");
    }

    void borrowBook(Borrower borrower, Book book1) {
        borrower.borrowBook(book1);
        book.remove(book1);
        System.out.println(borrower.getName()+" borrow: "+book1.getTitle());
        System.out.println("=========================================");
    }

    void returnBook(Borrower borrower, Book book1) {
        if(borrower.removeBook(book1) == 1){
            System.out.println(borrower.getName()+" returned: "+book1.getTitle());
            book.add(book1);
        } else {
            System.out.println(borrower.getName()+" not borrow this book");
        } 
        
    }

    void displayLibraryBooks() {
        System.out.println("");
        System.out.println("### Display Library Books ###");
        for(Book books : book) {
            System.out.println("Title: "+books.getTitle());
            System.out.println("ISBN: "+books.getISBN());
            System.out.println("Author: "+books.getAuthor().getName());
            System.out.println("Title: "+books.getAuthor().getBiography());
            System.out.println("=========================================");
        }
    }
}
