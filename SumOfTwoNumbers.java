import java.util.Scanner;


public class SumOfTwoNumbers {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter an Integer");
		int i = reader.nextInt();
		System.out.println("Enter a Floating number");
		float f = reader.nextFloat();
		System.out.println("The integer part of sum of the above numbers is " + (int)(i+f));
				
	}
	

}
