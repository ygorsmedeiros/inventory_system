package entity;

public class Product {

	private String name;
	private double price;
	private double dimensionProduct;
	private double WeightProduct;
	private String description;
	private String exhibition;
	private String category;
	private int quantity;
	
	
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product( String name, double price, double dimensionProduct, 
			double weightProduct, String description, String exhibition, String category, int quantity) {

		this.name = name;
		this.price = price;
		this.dimensionProduct = dimensionProduct;
		WeightProduct = weightProduct;
		this.description = description;
		this.exhibition = exhibition;
		this.category = category;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDimensionProduct() {
		return dimensionProduct;
	}

	public void setDimensionProduct(double dimensionProduct) {
		this.dimensionProduct = dimensionProduct;
	}

	public double getWeightProduct() {
		return WeightProduct;
	}

	public void setWeightProduct(double weightProduct) {
		WeightProduct = weightProduct;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExhibition() {
		return exhibition;
	}

	public void setExhibition(String exhibition) {
		this.exhibition = exhibition;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}