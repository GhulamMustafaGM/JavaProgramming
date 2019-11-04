import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a1;
		int b2;
		int total;
		
		System.out.print("Enter number1: ");
		a1 = input.nextInt();
		
		System.out.print("Enter number2: ");
		b2 = input.nextInt();
		
		total = a1 + b2;
		
		System.out.printf("Total is : %d%n", total);
	}

}
