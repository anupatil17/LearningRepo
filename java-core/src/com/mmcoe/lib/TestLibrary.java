package com.mmcoe.lib;
public class TestLibrary {
	public static void main(String[] args) {
		Book b1=new Book("Java Programming");
		Book b2=new Book("Data Science");
		
		Member m1=new Member("Anuja");
		Member m2=new Member("Sanskruti");
				
		System.out.println("\nStatus:");
		b1.status();
		b2.status();
		m1.status();
		m2.status();
		
		System.out.println("\nIssuing Book:");
		try {
			b1.issueBook(m2);
			b1.issueBook(m1);
		} catch (LibraryIssueBookException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nStatus: ");
		b1.status();
		m2.status();
		
		System.out.println("\nReturning Book:");
		b1.returnBook();
		
		System.out.println("\nStatus:");
		b1.status();
		m2.status();
		
		//print their status
		//return book from member
		//issue book to member

	}
}
