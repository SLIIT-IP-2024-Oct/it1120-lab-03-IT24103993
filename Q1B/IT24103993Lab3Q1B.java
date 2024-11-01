import java.util.Scanner;
	public class IT24103993Lab3Q1B 
	{
		public static void main(String[] args)

		{
		double Unit_Price,Kilograms,Amount,Discounted_Price; //Variable declration
		
		
		Scanner retailin=new Scanner(System.in); //Creating the object
	
		System.out.println("Enter the Unit Price LKR:"); //Taking the unit price as a user input 
		Unit_Price=retailin.nextDouble();

		System.out.println("Enter the Number of Kilograms:"); // Taking the number of Kilograms
		Kilograms=retailin.nextDouble();

		Amount=Unit_Price*Kilograms; //Mathematical function
		System.out.println("The Amount You Have to Pay LKR:"+Amount);

		Discounted_Price=Amount-((Amount*10)/100); //Finding the discounted price
		System.out.println("The Discounted Price is LKR:"+Discounted_Price); 
		}
	}