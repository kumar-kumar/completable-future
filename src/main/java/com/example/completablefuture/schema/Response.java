package com.example.completablefuture.schema;

public class Response {

	private String itemName;
	private String quantity;
	private boolean available;

	private long id;
	private String name;
	private String description;
	private String city;
	private int rating;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Response [itemName=" + itemName + ", quantity=" + quantity + ", available=" + available + ", id=" + id
				+ ", name=" + name + ", description=" + description + ", city=" + city + ", rating=" + rating + "]";
	}

}
