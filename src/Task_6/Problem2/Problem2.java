package Task_6.Problem2;

import java.util.*;

public class Problem2 {

    public static List<Books> filterBooksByAuthorsAge(ArrayList<Books> booksArray, int age) {
        return booksArray.stream().filter(b -> b.getAuthor().getAge() > age).toList();
    }

    public static void countsBooks(ArrayList<Books> booksArray) {
        int counter = 0;
        for(Books b: booksArray) {
            if(b.getAuthor().getAge() >=30 && b.getAuthor().getAge() <= 40)
                counter++;
        }
        System.out.println("Number of books with author age in the range 30-40 is: " +counter);
    }

    public static void main(String[] args) {

        ArrayList<Books> arrBooks = new ArrayList<>();

        Books b1 = new Books(1,"Java Programming","Alice Smith",34);
        Books b2 = new Books(2,"Python Basics","Bob Jones",45);

        arrBooks.add(b1);
        arrBooks.add(b2);

        List<Books> filterBooks = filterBooksByAuthorsAge(arrBooks, 40);
        for(Books b: filterBooks) {
            System.out.println(b.getId());
            System.out.println(b.getTitle());
            System.out.println(b.getAuthor().getName());
            System.out.println(b.getAuthor().getAge());
        }

        countsBooks(arrBooks);
    }
}
