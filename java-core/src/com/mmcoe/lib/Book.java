package com.mmcoe.lib;

public class Book {
	private String title;
	private Member mbr;
	
	public Book(String title) {
		this.title = title;
	}
	

	public Member getMbr() {
		return mbr;
	}


	public void setMbr(Member mbr) {
		this.mbr = mbr;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book [Title= "+ title+ "]";
	}
	
	public void issueBook(Member m) throws LibraryIssueBookException{
		if(mbr == null) {
			mbr=m;
			m.setBk(this);
			System.out.println(title + " issued to "+mbr);
			
		}
		else {
			throw new LibraryIssueBookException("Book is Already Issued");
		}
	}
	
	public void returnBook() {
		if(mbr != null) {
			mbr.setBk(null);
			System.out.println(title + " returned by "+mbr);
			mbr=null;
		}
		else {
			System.out.println(title+ " is not issued");
		}
	}
	public void status() {
		if(mbr==null) {
			System.out.println(title + " not issued to any member");
		}
		else {
			System.out.println(title+ " is issued to "+ mbr);
		}
	}
}
