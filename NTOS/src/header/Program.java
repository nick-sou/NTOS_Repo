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
		System.out.print("1. New\n");
		System.out.print("2. Add\n");
		System.out.print("3. Queue\n");
		System.out.print("4. Priority\n");
		System.out.print("5. Remove\n");
		System.out.print("6. Concatinate\n");
		System.out.print("7. Run\n");
		System.out.print("8. Logout\n");
		
	}
	
	public static int selection(int sel)
	{
		switch (sel)
		{
		case 1: 
			System.out.println("You have selected Option 1");
			break;
		case 2: 
			System.out.println("you have selected Option 2");
			break;
		case 3: 
			System.out.println("You have selected Option 3");
			break;
		case 4:
			System.out.println("You have selected Option 4");
			break;
		case 5:
			System.out.println("You have selected Option 5");
			break;
		case 6:
			System.out.println("You have selected Option 6");
			break;
		case 7:
			System.out.println("You have selected Option 7");
			break;
		case 8:
			System.out.println("You have selected Option 8");
			break;
		
		}
		
		
		return sel;
	}

}
