package message;

public class MessageDBSource implements IMessageSource {
	
      @Override
      public String fetchMessage() {
	  return "DB Message: Welcome to the class of Interfaces";
	  
}
	
	
}
