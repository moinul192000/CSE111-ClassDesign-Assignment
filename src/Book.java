/**
 * Created By Dark Sh@dow
 */
public class Book {
    /** Instance Variables **/
    private String title;
    private String author;
    private double price;

    /** Default Constructor **/
    public Book() {

    }
    /** Overloaded Constructor **/
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /** Instance methods **/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        String details ="Book Title = "+ this.title + "\n" + "Author = "+ this.author + "\n" + "Price = "+ this.price + "\n";
        System.out.println(details);
        return details;
    }
}
