package java8.features.streams;
import java.util.List;

import java8.features.streams.Book;
class Author {
    private String name;
    private List<Book> books;

    public Author(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Author{" +
               "name='" + name + '\'' +
               ", books=" + books +
               '}';
    }
}
