package Lab4.Excercise3;

public  abstract class Item {

	private int idNum;
	private String title;
	private int numOfCopies;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int idNum, String title, int numOfCopies) {
		super();
		this.idNum = idNum;
		this.title = title;
		this.numOfCopies = numOfCopies;
	}

	public void checkIn(int numOfCopies) {
		this.numOfCopies += numOfCopies;
	}

	public void checkOut(int numOfCopies) {
		this.numOfCopies -= numOfCopies;
		
	}

	public void addItem(int idNum, String str, int n) {
		setIdNum(idNum);
		setTitle(str);
		setNumOfCopies(n);
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	@Override
	public String toString() {
		return "Item [idNum=" + idNum + ", title=" + title + ", numOfCopies=" + numOfCopies + "]";
	}

public void print() {
		
		System.out.println("ID: " + idNum);
		System.out.println("Title:  " + title);
		System.out.println("Number of copies:  " + numOfCopies);
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Item otherItem = (Item) obj;
		return idNum == otherItem.idNum && title == otherItem.title && numOfCopies == otherItem.numOfCopies;
	}

	public void addItem() {
		numOfCopies++;
	}
	
	
}
	
	

