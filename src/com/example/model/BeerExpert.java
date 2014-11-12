package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<>();
		
		if(color.toLowerCase().equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		}
		else if(color.toLowerCase().equals("brown")) {
			brands.add("Bao Kubo");
			brands.add("Toto Beer");			
		}
		else if(color.toLowerCase().equals("dark")) {
			brands.add("Black Goose");
			brands.add("Night Crawler");
		}
		else if(color.toLowerCase().equals("light")) {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
			brands.add("Smooth Shot");
		}
		return brands;
	}
}
