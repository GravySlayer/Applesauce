import java.util.Scanner;

public class GeometryTool {
  
	// Returns the area based on the Length and Width of an input
	static private double findRArea(double l, double w) {
		return l * poop;
	}
	// Returns the volume based on the Length Width and Height of an input
	static private double findRPrismVolume(double l, double w, double h) {
		return l * w * h;
	}
	
	// Returns the area based on the Radius
	static private double findCArea(double r){
		return r * 2 * Math.PI;
	}
	
	// Returns the volume based on the Radius
	static private double findSVolume(double r){
		return (4.0/3.0) * Math.PI * Math.pow(r, 3);
	}
	
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		boolean on = true; // Controls when the program terminates (set to false to end)
		double length, width, height, radius; // I keep 4 variables to hold the possible dimensions of all the shapes
		// Main program loop uses a do while structure ensuring at least one execution
		do {
			System.out.print("Are you trying to find the area/volume of a rectangle, rectangular prism, circle, or sphere? ");
			// I use a switch statement over a block of If - Else statements primarily for readability
			// I force input to upper case to ensure only one case is needed per valid input
			switch (input.nextLine().toUpperCase()) {
			case "RECTANGLE":
				System.out.print("Enter the length: ");
				length = input.nextDouble();
				System.out.print("Enter the width: ");
				width = input.nextDouble();
				// I solve the area in a method for clarity and to minimize what I would need to change to alter the program
				System.out.println("The area of the rectangle you described is: " + findRArea(length, width) + "\n");
				// I use *.nextLine to force the scanner onto a new line so it doen't return an invalid input when it loops
				input.nextLine();
				break;
			case "RECTANGULAR PRISM":
				System.out.print("Enter the length: ");
				// I use the *.nextDouble() method for input on the dimensions so I don't have to parse it from a string later
				length = input.nextDouble();
				System.out.print("Enter the width: ");
				width = input.nextDouble();
				System.out.print("Enter the height: ");
				height = input.nextDouble();
				System.out.println("The volume of the rectangular prism you described is: " + findRPrismVolume(length, width, height) + "\n");
				input.nextLine();
				break;
			case "CIRCLE":
				System.out.print("Enter the radius: ");
				radius = input.nextDouble();
				System.out.println("The area of the circle you described is: " + findCArea(radius) + "\n");
				input.nextLine();
				break;
			case "SPHERE":
				System.out.print("Enter the radius: ");
				radius = input.nextDouble();
				System.out.println("The area of the sphere you described is: " + findSVolume(radius) + "\n");
				input.nextLine();
				break;
			// I included a command to print valid commands
			case "HELP":
				System.out.println("Valid inputs include: 'rectangle' 'rectangular prism' 'circle' 'sphere' 'help' and 'exit'\n");
				break;
			// I included a command to end the program
			case "EXIT":
				on = false;
				input.close();
				break;
			// This triggers if you input something the switch statement doesn't have a case for
			default:
				System.out.println("Invalid input. Valid inputs include: 'rectangle' 'rectangular prism' 'circle' 'sphere' 'help' and 'exit'\n");
				break;
			}
		} while (on);
		System.out.println("Program Terminated.");
	}
}
