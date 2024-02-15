package entity;

public class StockControl {

	 private Inventory inventory;

	    public void StockControlSystem() {
	        this.inventory = new Inventory();
	    }

	    public void addProductToStock(Product product) {
	        inventory.addProduct(product);
	    }

	    public void removeProductFromStock(String productName) {
	        inventory.removeProduct(productName);
	    }

	    public Product getProductInfo(String productName) {
	        return inventory.getProduct(productName);
	    }

	    public boolean isProductInStock(String productName) {
	        return inventory.containsProduct(productName);
	    }
}
