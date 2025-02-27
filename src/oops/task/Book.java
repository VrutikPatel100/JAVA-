package oops.task;

//library management system

public class Book
{
	private String title;
	private String author;
	private String isbn;
	
	//parameterised constructor
	
	public Book(String title , String author ,String isbn)
	{
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	
	public void settitle(String title)
	{
		this.title = title;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	public String gettitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getIsbn()
	{
		return isbn;
	}
	public void displayBookInfo()
	{
		System.out.print("Title :" + title + ", Author : " + author + ", Isbn : "+ isbn);
	}

}