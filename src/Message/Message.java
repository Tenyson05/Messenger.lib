package Message;

public abstract class Message {
	private String data;

	public Message() {
		super();
		data = "";
	}


	public Message(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Message [data=" + data + "]";
	}


	public void add(Message message) {
		// TODO Auto-generated method stub
		
	}

}
