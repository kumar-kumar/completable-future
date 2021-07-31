package com.example.completablefuture.client.grocery;

public class Grocery {

	private String itemName;
	private String quantity;
	private boolean available;

	public Grocery(String itemName, String quantity, boolean available) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.available = available;
	}

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

	@Override
	public String toString() {
		return "Grocery [itemName=" + itemName + ", quantity=" + quantity + ", available=" + available + "]";
	}

}
