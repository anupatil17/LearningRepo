package com.mmcoe.stock;


public class StockSingleton {

    
	 private static Exchange stock;

	    private StockSingleton() {
	    }

	    public static Exchange getStock() {
	        if (stock == null) {
	            stock = new ();
	        }
	        return stock;
	    }
}