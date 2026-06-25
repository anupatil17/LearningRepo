package com.mmcoe.cart;

public class TestShopping {
	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart();
		
		//CartFactory fact=new CartFactory();
		
	//	Shopping cart=fact.newCart();
		
		try {
			cart.addToCart("Iphone",75000);
			cart.addToCart("Keychain",300);
			cart.addToCart("Phone Case",500);
			cart.addToCart("Buds",1500);
			cart.addToCart("Saree",900);
			//cart.addToCart(new Product("Shoes",800));
			
		} catch (CheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		cart.checkOut();
	}
}
