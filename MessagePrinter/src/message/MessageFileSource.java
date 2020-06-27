package message;

public class MessageFileSource implements IMessageSource {

	@Override
	public String fetchMessage() {
		return "File Message: Interfaces play a key role";
	}
	
}
