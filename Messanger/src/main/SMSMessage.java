package main;

public class SMSMessage extends Message {

	public SMSMessage(ILogin iLogin, String from, String to, String messageContent) {
		super(iLogin, from, to, messageContent);
	}

	@Override
	public void send(String name, String password) {
		if(iLogin.authenticate(name, password)) {
			System.out.println("SMS sent from " +from+" to "+to+": "+messageContent);
		} else {
			System.out.println("SMS authentication failed for user: "+name);
		}
	}

}
