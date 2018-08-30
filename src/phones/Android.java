package phones;
import Message.Message;
import Storage.Google;
import protocols.MessageProtocol;
public final class Android extends Phone implements MessageProtocol {
	
	public Android() {
		super(new Google());
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
