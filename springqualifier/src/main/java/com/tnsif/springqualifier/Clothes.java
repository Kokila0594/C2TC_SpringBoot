package com.tnsif.springqualifier;

import org.springframework.stereotype.Component;

@Component
public class Clothes implements ShoppingMall {
	public void purchase() {
		System.out.println("I am purchasing cloths");
	}
}