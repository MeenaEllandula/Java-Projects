package interface1;

public class MessagePrinter1 extends MessagePrinter{

	private MessageNewDB messageNewDB;
	
	public MessagePrinter1() {
       messageNewDB = new MessageNewDB();
	
	}
	@Override
	public void printMessage(String sourceName) {
		super.printMessage(sourceName);
		
		if(sourceName.equals("newdb")) {
			System.out.println(messageNewDB.fetchNewDBMessage());
		}
	}
	
}
