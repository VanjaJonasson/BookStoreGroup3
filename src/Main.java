import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
