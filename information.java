package Assignment;

import java.util.Scanner;
public class information {
	
	public static void newinfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========================");
		
		System.out.println("- Enter the name of the disaster: ");
		String name = sc.nextLine();
		
		System.out.println("- Enter the discription of the disaster: ");
		String disc = sc.nextLine();
		
		System.out.println("- Enter the strategies to lower the impact of the disaster: ");
		String stra = sc.nextLine();
		
		System.out.println("========================");
		
		System.out.println("Do you want to add more information? (1. Yes || 2. No)");
		int cho = sc.nextInt();
		switch(cho) {
			case 1:
				information.newinfo();
			break;
			default:
				System.out.println("========================");
				System.out.println("Information added successfully.");
				System.out.println("========================");
				main.main(null);
				
			}
		}
	
	public static void delinfo() {
		System.out.println("========================");
		System.out.println("Select the information you want to delete: ");
		}
	

}


