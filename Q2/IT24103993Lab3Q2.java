import java.util.Scanner;
	public class IT24103993Lab3Q2 
	{
		public static void main(String[] args)

		{
		int Total_Salary,Monthly_Salary,othours,otrate; //Variable declration

		Scanner salary=new Scanner(System.in); //Creating the object

		System.out.println("Enter the Monthly Salary"); //Read the Monthly salary
		Monthly_Salary=salary.nextInt();

		System.out.println("Enter OT Hours"); //Read the ot hours
		othours=salary.nextInt();

		System.out.println("Enter OT Rate"); //Read the ot rate
		otrate=salary.nextInt();

		Total_Salary=Monthly_Salary+(othours*otrate); //Calculations
		
		System.out.println("The Total Salary is LKR"+Total_Salary);
		}
	}