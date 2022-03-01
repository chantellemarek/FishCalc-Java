package fishCalcPackage;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// variables
		String calculateWeight;
		double length;
		double girth;
		
		// Scanner to take in user input
		Scanner keyboard = new Scanner(System.in);
		
		// Ask for Fish Species
		System.out.println("What is the Species of Fish You Caught?" + "\nEnter Size in Inches - Weight is Estimated");
		System.out.print("\t1 for Panfish (Bluegill, Perch, Crappie, Pumpkin Seed)\n\t2 for Bass (Smallmouth, Largemouth, Rock)"
				+ "\n\t3 for Walleye (Walleye, Sauger)\n\t4 for Trout (Brown, Rainbow)\n\t5 for Northern Pike\n\t6 to Quit");
		
		calculateWeight = keyboard.nextLine();
		
		switch(calculateWeight.charAt(0)) {
		
		case '1': // Panfish
			// Input
			System.out.print("What is the length of your fish?");
			length = keyboard.nextDouble();
			System.out.print("What is the width of your fish?");
			girth = keyboard.nextDouble();
			// Output
			System.out.print("Panfish Estimated Weight is " + (FishWeight.getPanfish(length, girth)) + " Pounds.");
			break;
			
		case '2': // Bass
			// Input
			System.out.print("What is the length of your fish?");
			length = keyboard.nextDouble();
			System.out.print("What is the width of your fish?");
			girth = keyboard.nextDouble();
			//Output
			System.out.print("Bass Estimated Weight is " + (FishWeight.getBass(length, girth) + " Pounds."));
			break;
		case '3': // Walleye
			// Input
			System.out.print("What is the length of your fish?");
			length = keyboard.nextDouble();
			System.out.print("What is the width of your fish?");
			girth = keyboard.nextDouble();
			// Output
			System.out.print("Walleye Estimated Weight is " + (FishWeight.getWalleye(length, girth)) + " Pounds.");
			break;
		case '4': // Trout
			// Input
			System.out.print("What is the length of your fish?");
			length = keyboard.nextDouble();
			System.out.print("What is the width of your fish?");
			girth = keyboard.nextDouble();
			// output
			System.out.print("Trout Estimated Weight is " + (FishWeight.getTrout(length, girth)) + " Pounds.");
			break;
		case '5': // Trout
			// Input
			System.out.print("What is the length of your fish?");
			length = keyboard.nextDouble();
			System.out.print("What is the width of your fish?");
			girth = keyboard.nextDouble();
			// output
			System.out.print("Northern Pike Estimated Weight is " + (FishWeight.getPike(length, girth)) + " Pounds.");
			break;
			
		case '6': //End the Program with a Nice Message to the User
		      System.out.print("Thank You for Using the Estimated Fish Weight Calculator!");
		      break;
		      
		// Default if Something Invalid is Entered
		default:
			System.out.println("Invalid selection! Please Try Again");
		           
		    keyboard.close();  
		}

	}

}
