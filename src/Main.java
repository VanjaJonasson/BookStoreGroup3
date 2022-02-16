


import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner scanner;


    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addBookToCart(new Book(1000, "Boken om grupp3", "Vi i gruppen", 199));
        cart.addBookToCart(new Book(1001, "Bilar", "Åke", 300));

        List<Book> books = cart.getBooks();


        while(true) {
            displayMenu();
            int option = getOption();
            if (option == 1) {
                System.out.println(books);
            } else if (option == 2) {
                // ShoppingCart
            } else if (option == 3) {
                // Customers
            } else if (option == 4) {
                System.out.println("Exiting...");
                return;
            }
        }

    }


    static void displayMenu() {
        System.out.println("_______________________________\n\t\t- Menu -");
        System.out.println("1. Books");
        System.out.println("2. Shopping cart");
        System.out.println("3. Customer Info");
        System.out.println("4. Exit");
    }

    static int getOption() {
        System.out.print("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }


    static {
        scanner = new Scanner(System.in);
    }
}
