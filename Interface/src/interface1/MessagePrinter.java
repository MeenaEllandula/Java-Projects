package interface1;
/*
 * Meena 
 */
public class MessagePrinter {
 
	private MessageDB messageDB;
	private MessageFile  messageFile;
	
	public MessagePrinter() {
       messageDB = new MessageDB();
       messageFile = new MessageFile();
	
	}
	public void printMessage(String sourceName) {
		if(sourceName.equals("db")) {
			System.out.println(messageDB.fetchDBMessage());
			
		}
		else if(sourceName.equals("file")) {
			System.out.println(messageFile.fetchFileMessage());
		}
		
	}
}
