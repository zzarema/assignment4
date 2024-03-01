
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();


        UserInterface ui = new UserInterface(cart);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter item name (or type 'exit' to finish): ");
            String itemName = scanner.nextLine();
            if (itemName.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Enter item price: ");
            double itemPrice = Double.parseDouble(scanner.nextLine());
            ClothingItem newItem = new ClothingItem(itemName, itemPrice);
            cart.addItem(newItem);
        }
        scanner.close();
    }
}