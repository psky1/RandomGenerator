import java.util.Scanner;


public class GetAndStoreInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		String firstInitial, lastName, houseNumber, streetName, streetType, city;
		//Scanner keyboard = new Scanner(System.in); 
		//String myAnswer = keyboard.next(); 
		firstInitial = keyboard.next();
		lastName = keyboard.next();
		houseNumber = keyboard.next();
		streetName = keyboard.next();
		streetType = keyboard.next();
		city = keyboard.next();
		

		
		System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
		System.out.println(streetName + " " + streetType + " " + city);
	}
}

