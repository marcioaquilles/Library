package br.edu.cest.library;

/**
 *
 * @author Aquilles
 */
public class Item {
    private String title;
    private String publisher;
    private String yearPublished;
    private String ISBN;
    private String price;

    public Item(String title, String publisher, String yearPublished, String ISBN, String price) {
        this.title = title;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
}
