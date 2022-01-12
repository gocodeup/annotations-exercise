/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public class Author extends Person {
    private List books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @Deprecated
    public List<String> getBooks() {
        return books;
    }

    public List<String> publishedBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }
    //I had to fix this in easy_fix??
    //@Override
    public String sortName(String firstName, String lastName) {
        return String.format("%s, %s", lastName, firstName);
    }
}
