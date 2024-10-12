import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // Book book1 = new Book("100 años de soledad", "Gabiel Garcia Marquez");//test
        // book1.displayInfoBook();

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        boolean exit = false;

        while (!exit) {        // Options menu

            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a book");
            System.out.println("2. List all books");
            System.out.println("3. Search for a book");
            System.out.println("4. Borrow a book");
            System.out.println("5. Return a book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // clean input buffer

            // Flow control structure(switch)
            switch (option) {
                case 1:
                    // Add book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    break;

                case 2:
                    // List books
                    library.showBooks();
                    break;

                case 3:
                    // Buscar un libro por título
                    System.out.print("Enter the title to search: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.findBook(searchTitle);
                    if (foundBook != null) {
                        foundBook.displayInfoBook();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    // Prestar un libro
                    System.out.print("Enter the title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;

                case 5:
                    // Devolver un libro
                    System.out.print("Enter the title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;

                case 6:
                    // Salir del sistema
                    exit = true;
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
