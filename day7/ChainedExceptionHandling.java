package day7;

public class ChainedExceptionHandling {


		public static void main(String[] args) {

			String str = "fdsv";

			try {
				// throw new StringIndexOut....();
				//char p = str.charAt(484);
				char x[] = str.toCharArray();
				
				int index = 8800;
				if(index>=3)
				{
					System.out.println(" Wrong Index value "+index);
				}
				else { 
					char y = x[index];
					
				}
				
			} 
			catch (StringIndexOutOfBoundsException e) {
				System.out.println("1");
				System.out.println(e);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(" 2 "+e);
			}
		
			catch (Exception e) {
				System.out.println("3 default Exceptions");
				System.out.println(e.getMessage());
			}
			
			catch(Throwable t)
			{
				System.out.println(" Throwable "+t);
			}
		

		}
}
