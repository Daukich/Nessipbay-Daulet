import java.util.ArrayList;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book(1, "1984", "George Orwell", true));
        library.add(new Book(2, "To Kill a Mockingbird", "Harper Lee", true));
        library.add(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald", true));
        library.add(new Book(4, "Moby Dick", "Herman Melville", true));
        library.add(new Book(5, "Pride and Prejudice", "Jane Austen", true));
        for (Book book : library) book.displayBookDetails();
        for (Book book : library) {
            book.displayBookDetails();
        }
        System.out.println("\nList of available books:");
        for (Book book : library) {
            if (book.isAvailable()) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}
