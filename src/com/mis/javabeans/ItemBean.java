package com.mis.javabeans;

public class ItemBean {

	// 필드
	private String name;
	private int price;
	private String description;
	private String user;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "ItemBean [name=" + name + ", price=" + price + ", description=" + description + ", user=" + user + "]";
	}

}
