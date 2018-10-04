package main;
//import java.nio.file.spi.FileSystemProvider;

import Message.Message;
import Message.TextMessage;
import Storage.FileStorageProvider;
import phones.Android;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Android motorola = new Android(new FileStorageProvider());
		motorola.send(new TextMessage("testing"));
		motorola.viewAllMessages();

	}

}
