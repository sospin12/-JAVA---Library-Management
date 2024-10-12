import java.util.List;
import java.util.ArrayList;

public class Library {//class library definitio.
    //Attributes
    private List<Book> books;

    //Cosntructor
    public Library(){
        books = new ArrayList<Book>();
    }


    public void addBook(Book book){    //Metooth to add a book to the library
        books.add(book);
        System.out.println("Book added to the library.");
    }


    public void showBooks(){    //Metoth to show all the books in the library
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
            return;
        }
        for (Book book : books) {
            book.displayInfoBook();
        }
    }

    public Book findBook(String title) {    //Metod to find a book by title
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }


    public void borrowBook(String title) {    //Method to lend a book
        Book book = findBook(title);
        if (book == null) {
            System.out.println("The book is not in the library.");
            return;
        }
        if (book.isState()) {
            book.setState(false);
            System.out.println("The book has been lent.");
        } else {
            System.out.println("The book is not available.");
        }
    }

    public void returnBook(String title) {    //Method to return a book
        Book book = findBook(title);
        if (book == null) {
            System.out.println("The book does not exist in the library.");
            return;
        }
        if (!book.isState()) {
            book.setState(true);
            System.out.println("The book has been returned.");
        } else {
            System.out.println("The book is already available.");
        }
    }
}
