    /**
     * This source file is subject to the license that is bundled with this package in the file LICENSE.
     */
import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private ArrayList<String> books;

    Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList<>() ;
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @Deprecated
    public List<String> getBooks() {
        return books;
    }

    List<String> publishedBooks() {
        return books;
    }

    void addBook(String book) {
        books.add(book);
    }

    @Override
    public String fullName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
