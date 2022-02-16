


import java.util.List;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addBookToCart(new Book(1000, "Boken om grupp3", "Vi i gruppen", 199));

        cart.addNewBooks(3, 400, "Bilar", "Åke", 500);

        List<Book> books = cart.getBooks();

        int x = cart.getNumberOfBooksInCart();

        System.out.println(x);

        for (Book b : books) {
            b.printBookDetails();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("_______________________________\n\t\t- Menu -");
        System.out.println("1. Books");
        System.out.println("2. Shopping cart");
        System.out.println("3. Customer Info");
//        System.out.println("3. Exit");

        System.out.print("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();



        }
    }

