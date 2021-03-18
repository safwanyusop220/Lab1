package exercise8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
 
private static DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Weight for first person in kg : ");
		weightList person1 = new weightList();
		person1.setWeight(sc.nextDouble());
		
		System.out.print("Enter The Weight for second person in kg : ");
		weightList person2 = new weightList();
		person2.setWeight(sc.nextDouble());
		
		System.out.println("Person 1");
		
		// Weight in Earth
		System.out.println("Weight in Earth is " + person1.getWeight() + " Kg");
		
		// Weight in Mars
		double weight_mars = (person1.getWeight()/9.81) * 3.711;
		System.out.println("Weight in Mars is " + df.format(weight_mars) + " Kg");
		
		System.out.println("Person 2");
		
		// Weight in Earth
		System.out.println("Weight in Earth is " + person2.getWeight() + " Kg");
		
		// Weight in Mars
		weight_mars = (person1.getWeight()/9.81) * 3.711;
		System.out.println("Weight in Mars is " + df.format(weight_mars) + " Kg");
	}
}
