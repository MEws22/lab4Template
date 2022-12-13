package at.ac.tuwien.big.cpsml.codegen.lib;

import java.util.List;

public interface MessagingElement{

	void addPublication(Linkable mB, List<String> topics);
	
	void addSubscription(Linkable mB, List<String> topics);
	
	void sendAllMessages();
	
	void sendMessage(Linkable mB, String msg);
	
	String queryMessages();
	
}
