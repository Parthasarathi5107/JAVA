package Day3;

public class Dog {
    
		private String name;
		private int age;
		private int weight;
		
		
		
		
		public Dog(String name, int age, int weight) {
			super();
			this.name = name;
			this.age = age;
			this.weight = weight;
		}

		public String getName()
		{
			return name;
		}
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			// --- business operation ---
			// non-functional requiremenets ----
			this.age = age;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
			System.out.println(this);
		}

		// Business method
		public void doFeedAnimal()
		{
			this.weight+=10;
		}
		
		
		public void playGames()
		{
			
			// dog cannot playGames if weight is less than 2Kg or more than 30Kg
			
			// whenever dog playGame weight will be decreased by 1kg
			if(getWeight()<2 || getWeight()>30)
			{
				System.out.println("Your dog Cannot play games");
			}
			else
			{
				System.out.println("Your dog has played games ");
				setWeight(getWeight()-1);
			}
			
		}

		@Override
		public String toString() {
			return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
		}
		
		
	}

