package entity;

public class Product {

	private Integer cod;
	private String name;
	private String brand;
	private double price;
	private double dimensionProduct;
	private double WeightProduct;
	private Category category;
	private int quantity;
	
	
	public Product(Integer cod, String name, Category category, String brand, double price, int quantity) {
		this.cod = cod;
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(Integer cod, String name, String brand, double price, double dimensionProduct, 
			double weightProduct, Category category, int quantity) {

		this.cod = cod;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.dimensionProduct = dimensionProduct;
		WeightProduct = weightProduct;
		this.category = category;
		this.quantity = quantity;
	}


	public Integer getCod() {
		return cod;
	}
	
	public void setCod(Integer cod) {
		this.cod =  cod;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}