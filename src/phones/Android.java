package phones;
import Message.Message;
import Storage.Google;
import protocols.MessageProtocol;
import Storage.FileStorageProvider;
public final class Android extends Phone implements MessageProtocol {
	
	public Android(FileStorageProvider fsp) {
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
