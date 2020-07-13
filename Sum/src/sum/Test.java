package sum;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum sum = new Sum();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first  number: ");
		
		sum.a = scanner.nextInt();
		
        System.out.println("Enter second number: ");
		
		sum.b = scanner.nextInt();
		
		sum.calculateSum();
		
	}

}
