import java.util.Scanner;

public class JavaComparison {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int value1;
		int value2;
		
		System.out.print( "Enter value1: ");
		value1 = input.nextInt();
		
		System.out.print("Enter value2:");
		value2 = input.nextInt();
		
		if( value1 != value2)
			System.out.printf("%d != %d%n", value1, value2);
		
		if( value1 < value2)
			System.out.printf("%d < %d%n", value1, value2);
		
		if( value1 > value2)
			System.out.printf("%d > %d%n", value1, value2);
		
		if( value1 <= value2)
			System.out.printf("%d <= %d%n", value1, value2);
		
		if( value1 >= value2)
			System.out.printf("%d >= %d%n", value1, value2);
		

	}

}
