package main;

public class EmailMessage extends Message {

	public EmailMessage(ILogin iLogin, String from, String to, String messageContent) {
		super(iLogin, from, to, messageContent);
	}

	@Override
	public void send(String name, String password) {
		if(iLogin.authenticate(name, password)) {
			System.out.println("Email sent from " +from+" to "+to+": "+messageContent);
		} else {
			System.out.println("=Email authentication failed for user: "+name);
		}
	}


}
