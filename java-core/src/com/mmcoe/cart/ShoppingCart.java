package com.mmcoe.cart;

public class ShoppingCart implements Shopping {
	private class Product {
		private String name;
		private double price;
		Product next;

		private Product(String name, double price) {
			this.name = name;
			this.price = price;
			next = null;

		}

	}

	private Product head, last;
	private double total;
	private int count, limit;

	public ShoppingCart() {
		limit = 5;
	}

	public void addToCart(String name, double price) throws CheckException {
		if (count <= limit) {
			Product p = new Product(name, price);
			if (head == null) {
				head = p;
				count++;
				total+=p.price;
			} else {
				last.next = p;
				total+=p.price;
			}
			last = p;
			count++;
			System.out.println("Product added to cart.");
		} else {
			throw new CheckException("Cart is Full");
		}
	}

	public void checkOut() {
		Product p=head;
		System.out.println("Items in Cart:");

		for (int i = 0; i < limit; i++) {
			System.out.println(p.name+" : "+p.price);
			p=p.next;
		}

		System.out.println("Total Amount = " + total);
	}

	@Override
	public void addToCart(com.mmcoe.cart.Product p) throws CheckException {
		// TODO Auto-generated method stub

	}

}

/*
 * public class ShoppingCart implements Shopping{ private Product[] items;
 * private double total; private int count;
 * 
 * public ShoppingCart() { items=new Product[5]; }
 * 
 * public void addToCart(Product p) throws CheckException { if (count <
 * items.length) { items[count] = p; count++; total += p.getPrice();
 * System.out.println("Product added to cart."); } else { throw new
 * CheckException("Cart is Full"); } } public void checkOut() {
 * 
 * System.out.println("Items in Cart:");
 * 
 * for(int i = 0; i < count; i++) { System.out.println(items[i]); }
 * 
 * System.out.println("Total Amount = " + total); }
 * 
 * 
 * 
 * }
 */
