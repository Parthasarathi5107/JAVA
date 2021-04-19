package Lab4.Excercise3;

public class JournalPaper extends WrittenItem{

	private int pubYear;

	JournalPaper() {
		super();

	}
	
	public JournalPaper(int idNum, String str, int n, String author, int y) {
		super(idNum, str, n, author, y);
		pubYear = y;
	}

    public String toString()
    {
      return super.toString()+" Year published: "+ pubYear;
    }

    public void print(){
    	super.print();
    	System.out.println("Year published: "+ pubYear);
    	}
	
}
