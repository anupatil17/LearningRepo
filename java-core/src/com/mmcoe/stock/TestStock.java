package com.mmcoe.stock;

public class TestStock {
	public static void main(String[] args) {
		Holder h=StockSingleton.getStock();
		h.display();
		
		Broker b=StockSingleton.getStock();
		b.display();
		
		Exchange e=StockSingleton.getStock();
		e.display();
		
		System.out.println(h==b);
		System.out.println(b==h);
		
		
		
	}
}
