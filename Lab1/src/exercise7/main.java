package exercise7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {

	private static DecimalFormat df = new DecimalFormat("0.00");

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in kg : ");
				
		double weight = sc.nextDouble();
				
		// calculate weight in Mars
		double weight_mars = (weight/9.81) * 3.711;
		System.out.println("Weight in Mars is : " + df.format(weight_mars) + " Kg");
	}
	
}
