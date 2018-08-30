package phones;

import java.util.List;

import Storage.Google;
import Storage.Icloud;
import Storage.StorageProvider;
import Message.Message;
import Message.TextMessage;
import Message.PhotoMessage;
public abstract class Phone {
	protected StorageProvider storage;

//	public Phone(StorageProvider storageProvider) {
//		this.storage = storageProvider;
//	}
//	
	public Phone(Google storageProvider) {
		// TODO Auto-generated constructor stub
	}

	public Phone(Icloud icloud) {
		// TODO Auto-generated constructor stub
	}

	public void viewAllMessages(){
		List<Message> messages = storage.retrieveAll();
		for (Message m : messages){
			
			System.out.println(m);
			if(m instanceof TextMessage){
				System.out.println("This is a text Message");
				TextMessage textMessage = (TextMessage) m;
			}
			
		}
	}

}
