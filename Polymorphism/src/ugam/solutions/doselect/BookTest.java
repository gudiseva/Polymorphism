package ugam.solutions.doselect;

public class BookTest {

	public BookTest() {}

	public static void main(String[] args) {

		Book book = new Book("Java", "Arvind Gudiseva", 10);
		System.out.println(book.getDetails());
		
		Ebook ebook = new Ebook("Scala", "Nag Arvind Gudiseva", 10, "pdf");
		System.out.println(ebook.getDetails());
		
		PrintedBook printedBook = new PrintedBook("Python", "Nag Arvind", 10, 100, 250);
		printedBook.buy();
		System.out.println(printedBook.getDetails());
	}

}
