import java.util.Scanner;

public class JavaProduct {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int value1;
		int value2;
		int value3;
		
		int total;
		
		System.out.print( "Enter value1: ");
		value1 = input.nextInt();
		
		System.out.print("Enter value2:");
		value2 = input.nextInt();
		
		System.out.print("Enter number3: ");
		value3 = input.nextInt();
		
		total = value1 * value2 * value3;
		
		System.out.printf("The product is %d%n", total);
		
	}

}
