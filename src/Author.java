/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

import java.util.ArrayList;
import java.util.List;

//@SuppressWarnings("unchecked")

public class Author extends Person {
    private ArrayList<String> books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList<>();

    }

    /**
     * @deprecated Use publishedBooks instead
     * //
     */
//    @SuppressWarnings("all")
    @Deprecated
    public List<String> getBooks() {
        return books;
    }

    @SuppressWarnings("All")
    public ArrayList<String> publishedBooks() {
        return books;
    }

    @SuppressWarnings("All")
    public void addBook(String book) {
        books.add(book);
    }

    //    @Override
//    public String sortName() {
//        return String.format("%s, %s", lastName, firstName);
//    }
    @Override
    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
