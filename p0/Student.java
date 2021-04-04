package p0;

public class Student {
	
	private int marks;
	private String name;
	private int ID;
	private int fee;
	private int updatedfees;
	private int numberofsub;
	private double percent;
	private double p;
	
	
	public Student(String Studentname, int obtainedmarks, int rollno,
			int f, int sub)
	{
		super();
		name = Studentname;
		marks = obtainedmarks;
		ID = rollno;
		fee = f;
		numberofsub = sub;
		calculateFees();
		
	}
	

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	

	public int getUpdatedfees() {
		return updatedfees;
	}


	public void setUpdatedfees(int updatedfees) {
		this.updatedfees = updatedfees;
	}


	public int getNumberofsub() {
		return numberofsub;
	}

	public void setNumberofsub(int numberofsub) {
		this.numberofsub = numberofsub;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	

	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

	public int calculateMarks()
	{
		// ......
		
		percent = marks/numberofsub;
		return (int)percent;
	}
	
	/*  trigger
	 *  if student marks is less than 50 
	 *  ---->> fees += 50%
	 * */
	public void calculateFees()
	{
		p=calculateMarks();
		if (p!=50.0 && p<50.0)
			{
				updatedfees=fee+((50*fee)/100);
				
			}
		
	}

	

}
