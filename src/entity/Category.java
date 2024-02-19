package entity;

public class Category {
	
	private String nameCategory;
	private String description;
	private String exhibition;
	
	
	
	public Category(String nameCategory) {
		this.nameCategory = nameCategory;
	}


	public Category(String nameCategory, String description, String exhibition) {
		this.nameCategory = nameCategory;
		this.description = description;
		this.exhibition = exhibition;
	}


	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCatehory) {
		this.nameCategory = nameCatehory;
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

	
}
