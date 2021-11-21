package main.task12_13_14_15.classes.comparators;

import main.task12_13_14_15.classes.Book;

import java.util.Comparator;

public class BookComparatorTitle implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}