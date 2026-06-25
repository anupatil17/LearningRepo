package com.mmcoe.cart;

public final class CartFactory {
	
	public CartFactory() {
		
	}
	public Shopping newCart() {
		return new ShoppingCart();
	}
}
