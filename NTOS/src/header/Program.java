package header;
import java.util.*;
public class Program {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int selection = 0;
		System.out.printf("Welcome to NTOS, Please select an Option from the menu below\n");
		while(selection == 0)
		{
			menu();
			selection = scan.nextInt();
			if (selection > 8 || selection < 1)
			{
				selection = 0;
				System.out.print("Invalid entry, Enter an integer between 1-8\n");
			}else
				selection(selection);
		}
	}
	
	public static void menu()
	{
		System.out.println("1. New");
		System.out.println("2. Add");
		System.out.println("3. Queue");
		System.out.println("4. Priority");
		System.out.println("5. Remove");
		System.out.println("6. Concatinate");
		System.out.println("7. Run");
		System.out.println("8. Logout");
		
	}
	
	public static int selection(int sel)
	{
		switch (sel)
		{
		case 1: 
			System.out.println("You have selected Option " + sel);
			break;
		case 2: 
			System.out.println("you have selected Option " + sel);
			break;
		case 3: 
			System.out.println("You have selected Option " + sel);
			break;
		case 4:
			System.out.println("You have selected Option " + sel);
			break;
		case 5:
			System.out.println("You have selected Option " + sel);
			break;
		case 6:
			System.out.println("You have selected Option " + sel);
			break;
		case 7:
			System.out.println("You have selected Option " + sel);
			break;
		case 8:
			System.out.println("You have selected Option " + sel);
			break;
		
		}
		return sel;
	}

}
