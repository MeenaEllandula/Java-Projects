package com;

public class Item implements Cloneable{

	private int id;
	private String name;
	private float price;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
    @Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public boolean equals(Object obj) {
		Item item2 = (Item)obj;
		if(this.id == item2.id && this.name.equals(item2.name) && this.price == item2.price) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 20;
		int result = 0;
		result = prime + result + id;
		result = prime + result + ((name == null ) ? 0 : name.hashCode());
		result = prime + result + Float.floatToIntBits(price);
		return result;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: "+id +"\nName: "+name +"\nPrice: "+price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
