import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.out.print("Enter your test score: ");
    Scanner scan = new Scanner(System.in);

		int score = scan.nextInt();
		String finalGrade;
		finalGrade = " ";
		char grade = 'F';//I'm not hopeful
		
		if (score > 89) {
		    if (score >= 97)
		         finalGrade = "A+";
		    else if (score <= 92)
		    	finalGrade = "A-";
		    else finalGrade = "A";
		}
		else if (score > 79) {
		    if (score >= 87)
		         finalGrade = "B+";
		    else if (score <= 82)
		    	finalGrade = "B-";
		    else finalGrade = "B";
		}
		else if (score > 69) {
		    if (score >= 77)
		         finalGrade = "C+";
		    else if (score <= 72)
		    	finalGrade = "C-";
		    else finalGrade = "C";
		}
		else if (score > 59) {
		    if (score >= 67)
		         finalGrade = "D+";
		    else if (score <= 62)
		    	finalGrade = "D-";
		    else finalGrade = "D";
		}
		else if (score <= 59) 
				  finalGrade = "F";
		//else if (score > 79)
		  //  grade = 'B';
		//else if (score > 69)
		//    grade = 'C';
		//else if (score > 60)
		//	grade = 'D';
	
	
		//if (score > 69)
		    System.out.println("Your grade is " + finalGrade);
		//else
		//    System.out.println("Did you even look at the book?");
			}
}