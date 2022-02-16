


import java.util.Scanner;


public class Main {



    public static void main(String[] args) {

        System.out.println("hej");


        Cart cart = new Cart();

        cart.addBookToCart(new Book(1000, "Boken om grupp3", "Vi i gruppen", 199));

        cart.addNewBooks(new Book(3, 35, "Bilar", "Åke", 300));

        List<Book> books = cart.getBooks();



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
