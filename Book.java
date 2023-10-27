public class Book {

    private String title, author, genre;
    private int yearPublished, pageCount;
    private double price;

    public Book(String title, String author, String genre, int yearPublished, int pageCount, double price){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.pageCount = pageCount;
        this.price = price;
    }
    
    public String toString() {
        return String.format("\n%s\n\n%s\n%04d\n----------------------------\n%d pg.\n%s\n$%.02f", this.title, this.author, this.yearPublished, this.pageCount, this.genre, this.price);
    }
    public String getProperties() {
        return String.format("%s~%s~%s~%04d~%d~$%.02f", this.title, this.author, this.genre, this.yearPublished, this.pageCount, this.price);
    }
    public String toShortString() {
        return String.format("%s,%s", this.title, this.author.substring(this.author.lastIndexOf(' '), this.author.length()));
    }
}
