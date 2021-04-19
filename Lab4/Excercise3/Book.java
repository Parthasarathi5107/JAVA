package Lab4.Excercise3;

public class Book extends WrittenItem{

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String str, int n) {
		super(id, str, n);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public void print(){
		System.out.println("Display info about a book: ");
		super.print();
	}
}