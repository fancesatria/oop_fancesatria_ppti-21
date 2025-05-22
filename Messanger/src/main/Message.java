package main;

public abstract class Message {
	protected ILogin iLogin;
	protected String from, to, messageContent;
	
	public Message(ILogin iLogin, String from, String to, String messageContent) {
		this.iLogin = iLogin;
		this.from = from;
		this.to = to;
		this.messageContent = messageContent;
	}

	public ILogin getiLogin() {
		return iLogin;
	}

	public void setiLogin(ILogin iLogin) {
		this.iLogin = iLogin;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	
	public abstract void send(String name, String password);
	
	
}
