import java.util.Scanner;

public class Output { public static void main( String[] args ) 
{ Scanner sc = new Scanner(System.in);

    String firstName;
    int age;
    String height;
    double gpa;
   Scanner keyboard = new Scanner(System.in);
    System.out.print( "What is your first name? " );
    firstName = sc.next();

    System.out.print( "How old are you? " );
    age = keyboard.nextInt();

    System.out.print( "How tall are you? " );
    height = keyboard.next();

    System.out.print( "What is your GPA? " );
    gpa = keyboard.nextDouble();
    keyboard.close();
 
    System.out.println("First Name is " + firstName);
    System.out.println("Age is " + age);
    System.out.println("Height is " + height);
    System.out.println("GPA " + gpa);

    
    }
}