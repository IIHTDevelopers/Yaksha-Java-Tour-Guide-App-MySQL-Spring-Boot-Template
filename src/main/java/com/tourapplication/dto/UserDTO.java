package com.tourapplication.dto;

import java.util.List;

import com.tourapplication.entity.TourPackage;

public class UserDTO {
	private Long id;

	private String name;

	private String email;

	private List<TourPackage> tourPackages;

	public UserDTO() {
		super();
	}

	public UserDTO(Long id, String name, String email, List<TourPackage> tourPackages) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.tourPackages = tourPackages;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<TourPackage> getTourPackages() {
		return tourPackages;
	}

	public void setTourPackages(List<TourPackage> tourPackages) {
		this.tourPackages = tourPackages;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", email=" + email + ", tourPackages=" + tourPackages + "]";
	}
}
