package Assignment;

import java.util.ArrayList;

public class output {
	
    public static void displayInformation(ArrayList<ClimateInfo> informationList) {
    	
        if (informationList == null || informationList.isEmpty()) {
            System.out.println("No information available.");
        } 
        else {
            System.out.println("Displaying Information:");
            for (ClimateInfo info : informationList) {
            	
                System.out.println("Policies of Climate Change: " + info.policies());
                System.out.println("Strategies to eradicate Climate Change: " + info.strategies());
                System.out.println("Planning to eradicate Climate Change: " + info.planning());
                
                System.out.println("========================");
                
            }
        }
    }
}
