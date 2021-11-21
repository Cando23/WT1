package main.task12_13_14_15.classes;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int edition;
    private int isbn;

    public Book(String title, String author, int price, int edition, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getEdition() {
        return edition;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean equals(Object object) {
        if (object == null) return false;
        if (object.getClass() != this.getClass()) return false;
        return ((this.author == ((Book) object).author)
                && (this.title == ((Book) object).title)
                && (this.price == ((Book) object).price)
                && (this.edition == ((Book) object).edition)
                && (this.isbn == ((Book) object).isbn));
    }

    public int hashCode() {
        return Objects.hash(title, author, price, edition, isbn);
    }

    public String toString() {
        return title + "_" + author + "_" + price + "_" + edition + "_" + isbn;
    }

    public Object clone() {
        Book book = new Book(title, author, price, edition, isbn);
        return book;
    }

    @Override
    public int compareTo(Book o) {
        if (o == null) {
            return -1;
        }
        return (isbn < o.isbn) ? -1 : ((isbn == o.isbn) ? 0 : 1);
    }
}