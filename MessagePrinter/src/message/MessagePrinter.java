package message;

public class MessagePrinter {

	private IMessageSource messageSource;

	public MessagePrinter(IMessageSource messageSource) {
		super();
		this.messageSource = messageSource;
	}
	
	public void printMessage() {
		System.out.println(messageSource.fetchMessage());
	}
	
}
