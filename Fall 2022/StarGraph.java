import java.lang.Math;
import java.util.Scanner;

public class StarGraph {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int n;
		double xMin, x;

		System.out.print("Please enter the number of x values to process: ");
		n = keyboard.nextInt(); // size of array
		if (n <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0); // terminates program if array size is 0 or lower
		}

		double xValues[] = new double[n]; // creates instances of xValues with specified size
		double yValues[] = new double[n]; // creates instances of yValues with specified size

		System.out.print("Enter a minimum value for x: ");
		xMin = keyboard.nextDouble();

		System.out.print("Enter the amount to increment x: ");
		x = keyboard.nextDouble();
		if (x <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0); // terminates program if user enters non-positive number
		}
		
		System.out.println("\nValues");
		for (int i = 0; i < n; i++) {
			xValues[i] = xMin + (x * i); // fills xValues array starting with the xMin and incrementing by x
			yValues[i] = (20 * Math.abs(Math.sin(xValues[i]))); // fills yValues by using the formula y = 20|sin(x)|
			System.out.printf("x: %.3f, y: %.3f%n", xValues[i], yValues[i]); // prints the x and y values
		}

		System.out.println("\nGraph");
		for (int i = 0; i < n; i++) {
			System.out.print(":");
			for (int j = 0; j < (int) yValues[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		keyboard.close();
	}
}