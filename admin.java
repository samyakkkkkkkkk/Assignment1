package Assignment;

import java.util.Scanner;
public class admin {

	public static void adminUI(){
		System.out.println("========================");
		System.out.println("==== Welcome Admin ====");
		System.out.println("========================");
		Scanner input = new Scanner(System.in);
		System.out.println("1. Add New Information");
		System.out.println("2. Delete the existing information");
		System.out.println("3. Log Out");
		System.out.println("Please select the required field: ");
		int selection = input.nextInt();
		
		if (selection == 1) {
			information.newinfo();
		}
		else if (selection == 2) {
			information.delinfo();
		}
		else {
			System.out.println("========================");
			System.out.println("Thank You for Using the Application.");
			System.out.println("========================");
			System.out.println("========================");
			main.main(null);
		}
	}

}


