package com.mmcoe.cart;

public interface Shopping {
	public void addToCart(Product p) throws CheckException;
	public void  checkOut();
}
