class Book{

    private String title;
    private String author;
    private int yearPublished;
    private double price;

    // Constructor
    public Book (String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // Print each detail using toString()
    public String toString() {
        return "Title: " + title + " \nAuthor: " + author + " \nYear Published: " + yearPublished + " \nPrice: " + price;
    }


}

public class Task11 {
    public static void main(String[] args) {
        
        // Instantiate 3 book objects
        Book book1 = new Book("Java Programming", "Taylor Smash", 2000, 799.99);
        Book book2 = new Book("C# Programming", "James Cameron", 2010, 1_199.99);
        Book book3 = new Book("Python Programming", "Angel Swift", 2015, 2_499.99);

        // Print Result
        System.out.println("Book 1:");
        System.out.println(book1.toString());
        System.out.println();
        System.out.println("Book 2:");
        System.out.println(book2.toString());
        System.out.println();
        System.out.println("Book 3:");
        System.out.println(book3.toString());

    }

}
