package oops.task;

public class LibraryManagement 
{
	public static void main(String[] args)
	{
		Book book1 = new Book("AnsiC", "balaguruswami" , "12345");
		book1.displayBookInfo();
		
		System.out.println();
		ReferenceBook referenceBook = new ReferenceBook("java programming","balaguruswami","32198","programming");
		
		referenceBook.displayBookInfo();
	}
}

