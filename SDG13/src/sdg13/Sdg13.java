package sdg13;
import java.util.ArrayList;
import java.util.Scanner;

public class Sdg13 {
    adminPanel Admin=new adminPanel();
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the SDG13");
        System.out.println("Enter User Type (1 for Administrator, 2 for User): ");
        int userType;
        userType = scanner.nextInt();
        switch (userType) {
            case 1:
                System.out.println("You're now an adminstrator");
                Admin.admin();
                break;
            case 2:
                System.out.println("Welcome");
                UserMenu(scanner);
                break;
            default:
                System.out.println("Invalid user type");
                scanner.close();
        }

    }

    public static void main(String[] args) {

    }
}











