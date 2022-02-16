import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cart {


List<Book> cart = new ArrayList<>();


    public void addBookToCart(Book book) {
        cart.add(book);
    }


    public int getNumberOfBooksInCart() {
        int carsInStore = cart.size();
        return carsInStore;
    }


    public List<Book> getBooks() {
        return cart;
    }


    public void addNewBooks(int numberOfBooks, int BookId, String Title, String Author, int Price) {
        for (int i = 0; i < numberOfBooks; i++)  {
            addBookToCart(new Book(BookId, Title, Author, Price));
        }
    }


}


