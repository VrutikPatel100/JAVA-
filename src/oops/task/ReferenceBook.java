package oops.task;

public class ReferenceBook extends Book 
{
	private String category;
	
	public ReferenceBook(String title, String author, String isbn, String category) {
		super(title, author, isbn);
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	public void displayBookInfo()
	{
		super.displayBookInfo();
		System.out.println("category : " + category);
	}
}
