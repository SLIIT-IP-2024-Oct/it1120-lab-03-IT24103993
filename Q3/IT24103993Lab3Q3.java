import java.util.Scanner;
		public class IT24103993Lab3Q3	{
		public static void main(String[] args)	{
		
		// Declare variables
		int noffivethnotes,rem1,nofonethnotes,rem2,noffivehunotes,rem3,noftwohunotes,rem4,nofonehunotes,rem5,noffiftynotes,rem6,
		    noftwentynotes,rem7,noftennotes,rem8,noffivenotes,rem9,noftwonotes,rem10,nofonenotes; 
		
		Scanner notes=new Scanner(System.in); //Creating the object
		
		System.out.println("Enter the Amount LKR:");	//Take the amount as an input
		int amount=notes.nextInt();

		noffivethnotes=amount/5000;	//Finding the number of five thousand notes
		rem1=(amount-(noffivethnotes*5000));
		System.out.println("5000 Notes - "+noffivethnotes);

		nofonethnotes=rem1/1000;	//Finding the number of one thousand notes
		rem2=(rem1-(nofonethnotes*1000));
		System.out.println("1000 Notes - "+nofonethnotes);		
		
		noffivehunotes=rem2/500;	//Finding the number of five hundred notes
		rem3=(rem2-(noffivehunotes*500));
		System.out.println("500  Notes - "+noffivehunotes);

		noftwohunotes=rem3/200;		//Finding the number of two hundred notes
		rem4=(rem3-(noftwohunotes*200));
		System.out.println("200  Notes - "+noftwohunotes);

		nofonehunotes=rem4/100;		//Finding the number of one hundred notes
		rem5=(rem4-(nofonehunotes*100));
		System.out.println("100  Notes - "+nofonehunotes);

		noffiftynotes=rem5/50;		//Finding the number of fifty notes
		rem6=(rem5-(noffiftynotes*50));
		System.out.println("50   Notes - "+noffiftynotes);

		noftwentynotes=rem6/20;		//Finding the number of twenty notes
		rem7=(rem6-(noftwentynotes*20));
		System.out.println("20   Notes - "+noftwentynotes);

		noftennotes=rem7/10;		//Finding the number of ten notes
		rem8=(rem7-(noftennotes*10));
		System.out.println("10   Notes - "+noftennotes);

		noffivenotes=rem8/5;		//Finding the number of five notes
		rem9=(rem8-(noffivenotes*5));
		System.out.println("5    Notes - "+noffivenotes);

		noftwonotes=rem9/2;		//Finding thenumber of two notes
		rem10=(rem9-(noftwonotes*2));
		System.out.println("2    Notes - "+noftwonotes);

		nofonenotes=rem10/1;		//Finding the number of one notes
		System.out.println("1    Notes - "+nofonenotes);
							}
						}
















