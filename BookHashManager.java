import java.util.HashMap;
import java.util.Map;
final public class BookHashManager {
    private static Map<String, Book> books = new HashMap<>();

    public static void searchByName(String name) {
        try {
        System.out.println(books.get(name));
        } catch (Exception e) {
            System.out.println("Sorry, no book was found with that name. Make sure you spelled & capitalized it right.");
        }
    }

    public static void searchByProperty(String searchTerm) {
        for (Map.Entry<String, Book> book : books.entrySet()) {
            if (book.getValue().getProperties().contains(searchTerm)) {
                System.out.println(book.getValue().toShortString());
            }
        }
    }

    public static void fillMap() {
        books.put("War And Peace", new Book("War And Peace", "Leo Tolstoy", "Historical Fiction", 1867, 1225, 14.63));
        books.put("To Kill a Mockingbird", new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 1960, 281, 9.99));
        books.put("1984", new Book("1984", "George Orwell", "Dystopian", 1949, 328, 11.99));
        books.put("The Great Gatsby", new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classics", 1925, 180, 7.49));
        books.put("Pride and Prejudice", new Book("Pride and Prejudice", "Jane Austen", "Romance", 1813, 279, 6.99));
        books.put("Moby-Dick", new Book("Moby-Dick", "Herman Melville", "Adventure", 1851, 544, 12.95));
        books.put("The Catcher in the Rye", new Book("The Catcher in the Rye", "J.D. Salinger", "Coming of Age", 1951, 277, 10.99));
        books.put("Harry Potter and the Sorcerer's Stone", new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", 1997, 320, 8.99));
        books.put("The Hunger Games", new Book("The Hunger Games", "Suzanne Collins", "Dystopian", 2008, 374, 9.49));
        books.put("The Da Vinci Code", new Book("The Da Vinci Code", "Dan Brown", "Mystery", 2003, 454, 11.49));
        books.put("The Lord of the Rings", new Book("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 1954, 1178, 17.99));
        books.put("The Shining", new Book("The Shining", "Stephen King", "Horror", 1977, 447, 10.79));
        books.put("The Girl on the Train", new Book("The Girl on the Train", "Paula Hawkins", "Mystery", 2015, 336, 9.99));
        books.put("Gone with the Wind", new Book("Gone with the Wind", "Margaret Mitchell", "Historical Fiction", 1936, 1037, 14.95));
        books.put("The Hobbit", new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937, 310, 8.49));
        books.put("A Game of Thrones", new Book("A Game of Thrones", "George R.R. Martin", "Fantasy", 1996, 694, 12.99));
        books.put("The Alchemist", new Book("The Alchemist", "Paulo Coelho", "Adventure", 1988, 197, 7.99));
        books.put("The Fault in Our Stars", new Book("The Fault in Our Stars", "John Green", "Young Adult", 2012, 313, 9.49));
        books.put("The Road", new Book("The Road", "Cormac McCarthy", "Post-Apocalyptic", 2006, 287, 11.29));
        books.put("The Silent Patient", new Book("The Silent Patient", "Alex Michaelides", "Psychological Thriller", 2019, 323, 10.79));
        books.put("Educated", new Book("Educated", "Tara Westover", "Memoir", 2018, 334, 9.99));
    }
}
