package Storage;
import java.util.ArrayList;
import java.util.List;

import Message.Message;

public abstract class StorageProvider {
	private List<Message> messages;

	public StorageProvider() {
		messages = new ArrayList<Message>();
	}
	
	public boolean save(Message Message){
		messages.add(Message);
		return true;
	}

	public List<Message> retrieveAll() {
		return messages;
	}

}
