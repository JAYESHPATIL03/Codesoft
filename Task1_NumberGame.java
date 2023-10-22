import java.util.Scanner;
class miniproject
{
	public static void main(String [] args)
	{
		int mynumber = (int)(Math.random()*100); 
		Scanner sc = new Scanner(System.in);
		int usernumber;
		do
		{
			System.out.println("Guess My Number(1-100):");
		    usernumber = sc.nextInt();

			if(usernumber == mynumber)
			{
				System.out.println("WOOHOO... CORRECT NUMBER!!");
				break;
			}
			else if(usernumber > mynumber)
			{
				System.out.println("Your Number is too Large");
			}
			else
			{
				System.out.println("Your Number is too Small");
			}
		}while(usernumber >= 0);

		System.out.print("My Number Was..");
		System.out.println(mynumber);
	}
}
