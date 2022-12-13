package at.ac.tuwien.big.cpsml.codegen.lib;

import java.util.List;

public interface Linkable {
	
	String toString();
	
	String getTopics();
	
	void queueMessage(String msg);
	
	public List<String> retrieveMessages(String topic, String reciever);

}
