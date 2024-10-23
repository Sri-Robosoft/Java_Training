package Task_4.Problem6;

public class BookParameter {
    private String title;
    private String author;
    private int price;

    //Parameterized Constructor
    BookParameter(String title, String author, int price) {
        System.out.println("Parameterized Constructor");
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void bookDetails() {
        System.out.println("Book: " +title);
        System.out.println("Author: " +author);
        System.out.println("Price: " +price);
    }
}
