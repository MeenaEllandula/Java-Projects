package com;

import java.time.LocalDate;

public class Bid implements Cloneable{

	private int id;
	private float bidAmount;
	private LocalDate bidDate;
	
	private Item item;
	
	public Bid() {
		// TODO Auto-generated constructor stub
	}

	public Bid(int 	id, float bidAmount, LocalDate bidDate) {
		super();
		this.id = id;
		this.bidAmount = bidAmount;
		this.bidDate = bidDate;
	}
	
	@Override
	public String toString() {
		return "Bid [id=" + id + ", bidAmount=" + bidAmount + ", bidDate=" + bidDate + "]";
	}

	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(bidAmount);
		result = prime * result + ((bidDate == null) ? 0 : bidDate.hashCode());
		result = prime * result + id;
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bid other = (Bid) obj;
		if (Float.floatToIntBits(bidAmount) != Float.floatToIntBits(other.bidAmount))
			return false;
		if (bidDate == null) {
			if (other.bidDate != null)
				return false;
		} else if (!bidDate.equals(other.bidDate))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(float bidAmount) {
		this.bidAmount = bidAmount;
	}

	public LocalDate getBidDate() {
		return bidDate;
	}

	public void setBidDate(LocalDate bidDate) {
		this.bidDate = bidDate;
	}
		
}