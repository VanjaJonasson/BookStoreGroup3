

public class Main {



    public static void main(String[] args) {
        System.out.println("hej");


        Cart cart = new Cart();

        cart.addBookToCart(new Book(1000, "Boken om grupp3", "Vi i gruppen", 199));

        cart.addNewBooks(new Book(3, 35, "Bilar", "Åke", 300));

        List<Book> books = cart.getBooks();


    }
}
