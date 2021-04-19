package Lab4.Excercise3;

public abstract class WrittenItem extends Item{

	private String author;
	private int pubYear;
	
	public WrittenItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WrittenItem(int id, String str, int n)
	{
		this.setIdNum(id);
		this.setTitle(str);
		this.setNumOfCopies(n);
	}
	
	public WrittenItem(int id, String str, int n, String author, int pubYear)
	{
		this.setIdNum(id);
		this.setTitle(str);
		this.setNumOfCopies(n);
		this.author = author;
		this.pubYear = pubYear;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPubYear() {
		return pubYear;
	}


	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}
	
	public void print() {
		super.print();
		System.out.println("Author : "+author);
		System.out.println("Publishing Year : "+pubYear);
	}
}
