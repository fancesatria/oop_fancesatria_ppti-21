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
    public String name;
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

    void displayBorrowedBooks() {
        System.out.println(name+" borrowed : ");
        for (Book book : borrowed) {
            System.out.println(" Title: " + book.title);
            System.out.println(" ISBN: " + book.isbn);
            System.out.println(" Author: " + book.author);
            System.out.println(" Biography: " + book.author.biography);
            System.out.println("--------------------------------------------");
        }
    }
    
}

//Alice's Borrowed Books:
//Title: Clean Code
//ISBN: 987654321
//Author: Robert C. Martin
//Biography: Known for his works on software craftsmanship.
