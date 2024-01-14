import java.util.Scanner;

public class PracticeWithLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//Creates an array that will only allow 5 values to be inputed
		double[] numbers = new double[5];
		
		//Initialize the variables so that they can be calculated after the inputs are in.
		int i = 0;
		double total = 0;
		double average = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		
		//While loop will accept input up to the number specified in the earlier array.
		while(i < numbers.length) {
			System.out.print("Enter floating point number here: ");
			numbers[i] = input.nextDouble();
			total += numbers[i]; //Calculates the sum of the inputed numbers.
			
			if(numbers[i] > max) {
				max = numbers[i]; //Compares max with each new input to determine the new max
			}
			if(numbers[i] < min) {
				min = numbers[i]; //Compares min with each new input to determine the new min.
			}
			i++;
		}
		average = total / numbers.length;
		
		//Finally outputs all of the information collected in the loop.
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		System.out.println("Interest on total at 20%: " + (total * 0.20));
		
		input.close();

	}

}
