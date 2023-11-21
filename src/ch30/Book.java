package ch30;

public class Book {
	public String author;
	public String title;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return title + "," + "author";
	}
}
