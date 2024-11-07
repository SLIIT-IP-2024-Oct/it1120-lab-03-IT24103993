import java.util.Scanner;
		public class IT24103993Lab3Q4	{
		public static void main(String[] args)	{
		
		int digit1,digit2,digit3,digit4,digit5,rem1,rem2,rem3,rem4;	//Declare variables

		Scanner number=new Scanner(System.in); //Creating the object
		
		System.out.println("Enter a Five Digit Number");
		int innumber=number.nextInt();

		digit1=innumber/10000;
		rem1=(innumber-(digit1*10000));

		digit2=rem1/1000;
		rem2=(rem1-(digit2*1000));

		digit3=rem2/100;
		rem3=(rem2-(digit3*100));

		digit4=rem3/10;
		rem4=(rem3-(digit4*10));

		digit5=rem4/1;

		System.out.print(" "+digit1);
		System.out.print(" "+digit2);
		System.out.print(" "+digit3);
		System.out.print(" "+digit4);
		System.out.print(" "+digit5);
							}
						}
















