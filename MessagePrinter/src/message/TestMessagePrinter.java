package message;

import java.util.Scanner;

public class TestMessagePrinter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Select source to print message : ");
		System.out.println("1. Database: \n2. File ");
		int sourceInput = scanner.nextInt();
        
		switch (sourceInput) {
		case 1:
			MessagePrinter messagePrinter1 = new MessagePrinter(new MessageDBSource());
			messagePrinter1.printMessage();
			break;
		case 2:
			MessagePrinter messagePrinter2 = new MessagePrinter(new MessageFileSource());
			messagePrinter2.printMessage();
			break;

		default:
			System.out.println("Invalid selection!!! \nSelect 1 or 2");
			break;
		}
		scanner.close();

		
	}

}
