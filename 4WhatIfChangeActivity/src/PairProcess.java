import java.util.Scanner;

public class PairProcess {
	public static void main(String[] args) {
		int num1, num2, sum, product;
		float average;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();
		
		sum = (num1 + num2);
		product = (num1 * num2);
		average = (sum/2.0f);
		
		System.out.println("Sum is :" + sum);
		System.out.println("Product is :" + product);
		System.out.println("Average is :" + average);

		
	}
}
/*
Create a program that will 
output the sum, product and average of num1 and num2. If 
the calculated sum is over 200, print an asterisk next to the sum.
*/
