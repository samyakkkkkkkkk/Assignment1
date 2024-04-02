package sdg13;

import java.util.Scanner;

public class adminPanel{
    Scanner scan = new Scanner(System.in);
    public void admin(){
    System.out.println("Enter your email");
    String Email =scan.nextLine();
    System.out.println("Enter your Password");
    String Password = scan.nextLine();
    String pass="1010";
if (Password.equals(pass)){
        System.out.println("You are now logged in as an admin");
    }else {
        System.out.println("Invalid Input, Please log in again");
    }
}
}