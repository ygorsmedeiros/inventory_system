package entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Inventory {

	private Map<Integer, Product> products = new HashMap<Integer, Product>();

	public void addProduct(Integer cod, Product product) {
		products.put(cod, product);
	}

	public void removeProduct(Integer cod) {
		products.remove(cod);
	}

	public void updateProduct(Integer cod, Product newProduct) {
		products.put(cod, newProduct);

	}

	public boolean containsProduct(Integer cod) {
		return products.containsKey(cod);
	}

	public Product searchProductCod(Integer cod) {
		return products.get(cod);
	}

	public Product searchProductName(String name) {
		for (Product product : products.values()) {
			if (product.getName().equalsIgnoreCase(name)) {
				return product;
			}
		}
		return null;
	}

	public void updatePriceByBrand(String brand, double price) throws IllegalArgumentException {
		if (price < 0) {
			throw new IllegalArgumentException("O novo preço fornecido é inválido.");
		}

		boolean brandInStock = false;
		for (Product product : products.values()) {
			if (product.getBrand().equalsIgnoreCase(brand)) {
				brandInStock = true;
				product.setPrice(price);
			}
		}
		if (!brandInStock) {
			throw new IllegalArgumentException("A marca fornecida não existe no estoque.");
		}
	}

	public void updatePriceByCategory(String category, double price) throws IllegalArgumentException {
		if (price < 0) {
			throw new IllegalArgumentException("O novo preço fornecido é inválido.");
		}

		boolean categoryInStock = false;
		for (Product product : products.values()) {
			if (product.getCategory().getNameCategory().equals(category)) {
				categoryInStock = true;
				product.setPrice(price);
			}
		}
		if (!categoryInStock) {
			throw new IllegalArgumentException("A categoria fornecida não existe no estoque.");
		}
	}

	public Collection<Product> allProduct() {
		return products.values();
	}

	public int quantityProduct(Integer cod) throws IllegalArgumentException {
		Product product = products.get(cod);
		if (product != null) {
			return product.getQuantity();
		} else {
			throw new IllegalArgumentException(
					"Produto com o código interno " + cod + " não encontrado no estoque.");
		}
	}


}
