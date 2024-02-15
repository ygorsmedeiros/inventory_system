package entity;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, Product> products = new HashMap<String, Product>();

    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }

    public void removeProduct(String productName) {
        products.remove(productName);
    }

    public boolean containsProduct(String productName) {
        return products.containsKey(productName);
    }

    public Product getProduct(String productName) {
        return products.get(productName);
    }
    
}
