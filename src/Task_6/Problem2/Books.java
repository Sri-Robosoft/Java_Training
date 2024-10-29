package Task_6.Problem2;

public class Books {
    private int id;
    private String title;
    private Author author;

    Books(int id, String title, String name, int age) {
        this.id = id;
        this.title = title;
        this.author = new Author(name, age);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}
