 import java.util.Scanner;

public class AskingQuestions 
{ 
  public static void main( String[] args ) 
  { 
    Scanner keyboard = new Scanner(System.in);
    
//****************************************************************
 //   int num1, num2, num3;
    //Enter 2 temperatures and find the max value
 //   System.out.print( "First temperature? " );
//    num1 = keyboard.nextInt();

//    System.out.print( "Second temperature? " );
//    num2 = keyboard.nextInt();

//    System.out.println("The max value is : " + Math.max(num1, num2));
//*****************************************************************
 
    //Find the average between 2 double values
    
    double num1, num2, num3;
    System.out.print( "First double? " );
    num1 = keyboard.nextDouble();

    System.out.print( "Second double? " );
    num2 = keyboard.nextDouble();

    System.out.println("The average of the two values is : " + (num1+num2)/2);
  }
}