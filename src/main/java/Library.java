import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity) {
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBookCount() {
        return this.collection.size();
    }

    public void getAddBook(Book book) {
        if (this.collection.size() < this.capacity) {
            this.collection.add(book);
        }
    }
}
