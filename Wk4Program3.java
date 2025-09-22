package Condtionals;
import java.util.Scanner;

// Claire Francis, Week4Program3, September 22, 2025

// Look at the following code.  It converts a test score from 0-100 into a letter grade.
// Now program your ULTIMATE COMPUTER to adjust the code so that it also gives plus and minus grades. 
// Hint: "testscore % 10" will give the last digit of the testscore and that can be used to determine whether a plus or minus is needed in the grade. 
// The grading scale is:    (93 - 100 A)    (90 - 92   A-)  (87 - 89   B+)   (83 - 86   B)    (80 - 82   B-)
// (77 - 79   C+)  (73 - 76   C)  (70 - 72   C -)
// (67 - 69   D+)  (63 - 66  D)  (60 - 62  D-)  (0 - 59    F)






public class Wk4Program3 {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		int testScore;

		
		System.out.print("Insert your test score (percentage): ");
		testScore = userinput.nextInt();
		
		boolean A = ((testScore <= 100)&&(testScore >= 93));
		boolean B = ((testScore <= 86)&&(testScore >= 83));
		boolean C = ((testScore <= 76)&&(testScore >= 73));
		boolean D = ((testScore <= 66)&&(testScore >= 63));
		boolean F = ((testScore <= 59)&&(testScore >= 0));
		
		boolean plus = ((testScore % 10 >= 7)&&(testScore % 10 <= 9));
		boolean minus = ((testScore % 10 >= 0)&&(testScore % 10 <= 2));
		
		boolean Bplus = ((plus)&&(testScore > 86)&&(testScore < 90));
		boolean Cplus = ((plus)&&(testScore > 76)&&(testScore < 80));
		boolean Dplus = ((plus)&&(testScore > 66)&&(testScore < 70));
		
		boolean Aminus = ((minus)&&(testScore < 93)&&(testScore > 89));
		boolean Bminus = ((minus)&&(testScore < 83)&&(testScore > 79));
		boolean Cminus = ((minus)&&(testScore < 73)&&(testScore > 69));
		boolean Dminus = ((minus)&&(testScore < 63)&&(testScore > 59));
		
		if(A) {
			System.out.println("Your letter grade for your test score is: A");
		}
		if(B) {
			System.out.println("Your letter grade for your test score is: B");
		}
		if(C) {
			System.out.println("Your letter grade for your test score is: C");
		}
		if(D) {
			System.out.println("Your letter grade for your test score is: D");
		}
		if(F) {
			System.out.println("Your letter grade for your test score is: F");
		}
		if(Aminus) {
			System.out.println("Your letter grade for your test score is: A-");
		}
		if(Bminus) {
			System.out.println("Your letter grade for your test score is: B-");
		}
		if(Cminus) {
			System.out.println("Your letter grade for your test score is: C-");
		}
		if(Dminus) {
			System.out.println("Your letter grade for your test score is: D-");
		}
		if(Bplus) {
			System.out.println("Your letter grade for your test score is: B+");
		}
		if(Cplus) {
			System.out.println("Your letter grade for your test score is: C+");
		}
		if(Dplus) {
			System.out.println("Your letter grade for your test score is: D+");
		}



	}

}
