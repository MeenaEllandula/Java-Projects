package message;

import java.util.Scanner;

public class TestNewMessagePrinter {

	public static void main(String[] args) {
			
		    NewMessagePrinter newMessagePrinter = new NewMessagePrinter();
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Select source to print message : ");
			System.out.println("1. Database: \n2. File ");
			int sourceInput = scanner.nextInt();
	        
			switch (sourceInput) {
			case 1:
				newMessagePrinter.plugInMessageSource(new MessageDBSource());
				newMessagePrinter.printMessage();
				break;
			case 2:
				newMessagePrinter.plugInMessageSource(new MessageFileSource());
				newMessagePrinter.printMessage();
				break;

			default:
				System.out.println("Invalid selection!!! \nSelect 1 or 2");
				break;
			}
			scanner.close();

			
		}

	

}
