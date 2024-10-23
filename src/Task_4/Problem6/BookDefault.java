package Task_4.Problem6;

public class BookDefault {
    private String title;
    private String author;
    private int price;

    //Default Constructor
    BookDefault() {
        System.out.println("Default Constructor");
         // title = "Harry Potter";
         // author = "J.K Rowling";
         // price = 2000;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void bookDetails() {
        System.out.println("Book: " +title);
        System.out.println("Author: " +author);
        System.out.println("Price: " +price);
    }
}
