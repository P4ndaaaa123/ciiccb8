class Book{

    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book (String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public String toString() {
        return "Title: " + title + " \nAuthor: " + author + " \nYear Published: " + yearPublished + " \nPrice: " + price;
    }


}

public class Task11 {
    public static void main(String[] args) {
        
        Book book1 = new Book("Java Programming", "Will Smith", 2000, 5000.0);
        Book book2 = new Book("C# Programming", "James Cameron", 2010, 12000.0);
        Book book3 = new Book("Python Programming", "Angel Swift", 2015, 25000.0);

        System.out.println(book1.toString());

    }

}
