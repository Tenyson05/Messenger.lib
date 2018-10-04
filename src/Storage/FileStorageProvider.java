package Storage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import Message.Message;

public class FileStorageProvider extends StorageProvider {
	private String dataFile;
	private int maxMessage;
	
	public FileStorageProvider() {
		dataFile = "";
		maxMessage = 0;
				
	}
	
	public FileStorageProvider(String data, int amtMessage) {
		dataFile = data;
		maxMessage = amtMessage;
	}
	
	public boolean save(Message message) {
		List<Message>tempmessage = retrieveAll();
		tempmessage.add(message);
		ObjectOutputStream oos = null;
		try {
//			FileOutputStream FOS = new FileOutputStream(dataFile);
			oos = new ObjectOutputStream(new FileOutputStream(dataFile));
			oos.writeObject(tempmessage);
			oos.flush();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				if(oos != null) {
					oos.close();
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}
	
		}
		
		return true;
		
	}
	
	public List<Message> retrieveAll() {
		List<Message> tempmessage = new ArrayList<Message>();
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(dataFile));
			tempmessage = (List<Message>) ois.readObject();
		}
				
		catch(EOFException e) {
			e.printStackTrace();
		}
		catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(ois != null) {
					ois.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return tempmessage;
	}

	

}
