package Day4.cart;

import java.util.*;

public class Main {
    static Cart cart = new Cart();
    static void displayProducts()
    {
        System.out.println("\nCart contents:");
        for (Product product : cart.getProducts()) {
            System.out.println(product.getName() + " x" + product.getQuantity() +
                    " @ Rs" + product.getPrice());
        }
        System.out.println("\nTotal cost: Rs" + cart.calculateTotalCost());
    }
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Welcome to the online shopping cart!");
                while (true) {
                    System.out.print("Enter item name (or 'done' to finish): ");
                    String name = scanner.nextLine();
                    if (name.equalsIgnoreCase("done")) {
                        break;
                    }
                    System.out.print("Enter item price: ");
                    int price = scanner.nextInt();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    Product product = new Product(name, price, quantity);
                    cart.addProduct(product);
                }
                System.out.print("Enter the functionality : (remove or display)");
                String name1 = scanner.nextLine();
                if (name1.equalsIgnoreCase("remove")) {
                    System.out.print("Enter the name of the product to be removed :");
                    String name2 = scanner.nextLine();
                    cart.removeProduct(name2);
                    displayProducts();
                }
                else if (name1.equalsIgnoreCase("display")) {
                    displayProducts();
                    Order order = new Order();
                    order.confirmOrder();

                }
                else {
                    System.out.println("Incorrect Input");
                }
            }
        }

