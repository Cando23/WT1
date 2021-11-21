package main.task12_13_14_15.classes;

import java.util.Objects;

public class ProgrammerBook extends Book{
    public String language;
    public int level;
    public ProgrammerBook(String title, String author, int price, int edition, int isbn, String language, int level) {
        super(title, author, price,edition, isbn);
        this.language = language;
        this.level = level;
    }
    public boolean equals(Object object) {
        if (object == null) return false;
        if (object.getClass() != this.getClass()) return false;
        return ((super.equals((Book)object))
                && (this.language == ((ProgrammerBook) object).language)
                && (this.level == ((ProgrammerBook) object).level));
    }
    public int hashCode() {
        return Objects.hash(super.hashCode(),language, level);
    }
    public String toString() {
        return super.toString() + "_" + language + "_" + level;
    }

}
