package Day4.cart;

import java.util.ArrayList;
import java.util.List;

class Cart {
    private List<Product> list;

    public Cart() {
        list = new ArrayList<>();
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public void removeProduct(String name2)
    {
        list.removeIf(product -> product.getName().equalsIgnoreCase(name2));
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Product product : list) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }
    public ArrayList<Product> getProducts() {
        return (ArrayList<Product>) list;
    }
}
