package entity;

import java.util.Collection;

public class StockControl {

	private Inventory inventory;

	public StockControl() {
		this.inventory = new Inventory();
	}

	public void addProductToStock(Integer cod, Product product) {
		inventory.addProduct(cod, product);
	}

	public void removeProductFromStock(Integer cod) {
		inventory.removeProduct(cod);
	}

	public Product getProductInfo(Integer cod) {
		return inventory.searchProductCod(cod);
	}

	public boolean isProductInStock(Integer cod) {
		return inventory.containsProduct(cod);
	}
	
    public void updatePriceBrand(String brand, double newPrice) {
        inventory.updatePriceByBrand(brand, newPrice);
    }

    public void updatePriceCategory(String category, double newPrice) {
        inventory.updatePriceByCategory(category, newPrice);
    }

	public Collection<Product> allProduct() {
		return inventory.allProduct();
	}

	public int quantityProduct(Integer cod) {
		try {
			return inventory.quantityProduct(cod);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
			return 0;
		}
	}
}