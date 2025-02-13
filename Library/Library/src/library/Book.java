/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author fance
 */
public class Book {
    private String title, isbn;
    private Author author;

    public Book(String title, String isbn, Author author) {
           this.title = title;
           this.isbn= isbn;
           this.author = author;
    }
    
    public String getTitle(){
        if(title.equals("")){
            return "[No title]";
        }
        return title;
    }
    
    public String getISBN(){
        if(title.equals("")){
            return "[No ISBN]";
        }
        return isbn;
    }
    
    public Author getAuthor(){
        return author;
    }
    
}

//Book added to library: Java Programming
//Book added to library: Clean Code
//Alice borrowed: Java Programming
//Alice borrowed: Clean Code
//Alice's Borrowed Books:
//Title: Java Programming
//ISBN: 123456789
//Author: James Gosling
//Biography: Creator of the Java programming language.
//------------------------
//Title: Clean Code
//ISBN: 987654321
//Author: Robert C. Martin
//Biography: Known for his works on software craftsmanship.
//------------------------
//Alice returned: Java Programming
//Alice's Borrowed Books:
//Title: Clean Code
//ISBN: 987654321
//Author: Robert C. Martin
//Biography: Known for his works on software craftsmanship.
//------------------------
//Books in Library:
//Title: Java Programming
//ISBN: 123456789
//Author: James Gosling
//Biography: Creator of the Java programming language.
//------------------------
