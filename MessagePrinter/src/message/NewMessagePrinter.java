package message;

public class NewMessagePrinter {

	private IMessageSource messageSource;

	public NewMessagePrinter() {
		
	}
	
	public void plugInMessageSource(IMessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public void printMessage() {
		System.out.println(messageSource.fetchMessage());
	}
	
}
