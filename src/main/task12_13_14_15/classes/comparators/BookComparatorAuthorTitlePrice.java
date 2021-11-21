package main.task12_13_14_15.classes.comparators;
import main.task12_13_14_15.classes.Book;

import java.util.Comparator;

public class BookComparatorAuthorTitlePrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int title = o1.getTitle().compareTo(o2.getTitle());
        int author = o1.getAuthor().compareTo(o2.getAuthor());
        int price = (o1.getPrice() < o2.getPrice()) ? -1 : ((o1.getPrice() == o2.getPrice()) ? 0 : 1);
        if (author == 0) {
            if (title == 0) {
                return price;
            } else {
                return title;
            }
        } else {
            return author;
        }
    }
}
