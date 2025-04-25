package chapter12.Clone;

import java.util.ArrayList;

class Book implements Cloneable {
	String title;

	public Book(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "MyBook [title=" + title + "]";
	}
}

public class MyBook_03{
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		
		Book book1 = new Book("자바");
		Book book2 = new Book("자바");
		Book book3 = new Book("자바");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		System.out.println(bookList);
		
		ArrayList<Book> copyList = (ArrayList)bookList.clone();
		
		Book copybook = new Book("AI");
		copyList.add(copybook);
		copyList.add(new Book("C++"));
		book3.setTitle("Oracle");
		
		System.out.println(copyList);
	}
}
