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
public class Borrower {
    private String name;
    private final List<Book> borrowed;

    public Borrower(String name) {
        this.name = name;
        this.borrowed = new ArrayList<>();
    }
    
    public void borrowBook(Book book){
        borrowed.add(book);
    }
    
    public int removeBook(Book book){
        if(borrowed.remove(book)) return 1;
        return -1;
    }

    public void displayBorrowedBooks() {
        System.out.println(name+" borrowed : ");
        for (Book book : borrowed) {
            System.out.println(" Title: " + book.getTitle());
            System.out.println(" ISBN: " + book.getISBN());
            System.out.println(" Author: " + book.getAuthor().getName());
            System.out.println(" Biography: " + book.getAuthor().getBiography());
            System.out.println("--------------------------------------------");
        }
    }
    
    public String getName(){
        return name;
    }
    
}

//Alice's Borrowed Books:
//Title: Clean Code
//ISBN: 987654321
//Author: Robert C. Martin
//Biography: Known for his works on software craftsmanship.
