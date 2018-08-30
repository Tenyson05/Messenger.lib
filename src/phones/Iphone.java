package phones;
import Message.Message;
import Storage.Icloud;
import protocols.MessageProtocol;
public final class Iphone extends Phone implements MessageProtocol {
	
	public Iphone() {
		super(new Icloud());
	}
	
	public boolean send(Message message){
		System.out.println("Sending "+message.toString());
		return storage.save(message);
	}
	public boolean receive(Message message){
		System.out.println("Received "+message.toString());
		return storage.save(message);
	}

}
