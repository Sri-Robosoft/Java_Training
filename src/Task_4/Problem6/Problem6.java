package Task_4.Problem6;

public class Problem6 {
    public static void main(String[] args) {

        //Default Constructor
        BookDefault b1 = new BookDefault();
        b1.setTitle("Harry Potter");
        b1.setAuthor("J.K Rowling");
        b1.setPrice(3000);
        b1.bookDetails();


        //Paramterized Constructor
        BookParameter b2 = new BookParameter("To Kill a Mockingbird", "Harper Lee",3000);
        b2.bookDetails();
    }
}
