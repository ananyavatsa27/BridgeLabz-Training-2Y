import library.books.*;
import library.members.*;
import library.transactions.*;

public class StaticImportDemo{
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James Gosling");
        Member m = new Member("Ananya Vatsa");
        Transaction t = new Transaction();

        System.out.println("=== Library Transaction ===");
        b.display();
        m.display();
        t.issueBook(b, m);
    }
}

