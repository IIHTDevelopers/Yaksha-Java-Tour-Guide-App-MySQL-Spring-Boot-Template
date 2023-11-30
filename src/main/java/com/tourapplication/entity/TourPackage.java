package com.tourapplication.entity;

public class TourPackage {
	private Long id;

	private String placeName;

	private int numberOfDays;

	private double price;

	private String placesToVisit;

	public TourPackage() {
		super();
	}

	public TourPackage(Long id, String placeName, int numberOfDays, double price, String placesToVisit) {
		super();
		this.id = id;
		this.placeName = placeName;
		this.numberOfDays = numberOfDays;
		this.price = price;
		this.placesToVisit = placesToVisit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPlacesToVisit() {
		return placesToVisit;
	}

	public void setPlacesToVisit(String placesToVisit) {
		this.placesToVisit = placesToVisit;
	}

	@Override
	public String toString() {
		return "Package [id=" + id + ", placeName=" + placeName + ", numberOfDays=" + numberOfDays + ", price=" + price
				+ ", placesToVisit=" + placesToVisit + "]";
	}
}
