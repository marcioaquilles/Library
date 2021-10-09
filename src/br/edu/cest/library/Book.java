package br.edu.cest.library;

/**
 *
 * @author Aquilles
 */
public class Book extends Item {
   private String author;
   private String edition;
   private String volume;

    public Book(String title, String publisher, String yearPublished, String ISBN, String price) {
        super(title, publisher, yearPublished, ISBN, price);
    }

    public Book(String author, String edition, String volume, String title, String publisher, String yearPublished, String ISBN, String price) {
        super(title, publisher, yearPublished, ISBN, price);
        this.author = author;
        this.edition = edition;
        this.volume = volume;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
    
    
}
