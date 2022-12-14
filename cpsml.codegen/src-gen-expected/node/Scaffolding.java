package production.node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


import at.ac.tuwien.big.cpsml.codegen.lib.Linkable;
import at.ac.tuwien.big.cpsml.codegen.lib.MessagingElement;


import production.component.Scanner;

public class Scaffolding implements MessagingElement {

	private String name;
	private Map<Linkable,List<String>> publicationLinks;
	private Map<Linkable,List<String>> subscriptionLinks;
	private List<String> msgCache;
	private List<String> msgOutCache;
	
	private Scanner scanner;
	
	public Scaffolding(String name) {
		this.name = name;
		this.publicationLinks = new HashMap<>();
		this.subscriptionLinks = new HashMap<>();
		this.msgCache = new ArrayList<String>();
		this.msgOutCache = new ArrayList<String>();
		
		scanner = new Scanner("scanner");
		System.out.println("	Created Component of Scaffolding: Scanner");
		
	}
	
	private List<String> mergeStringLists(List<String> s1, List<String> s2) {
		List<String> merged = new ArrayList<String>();
		merged.addAll(s1);
		merged.addAll(s2);
		return merged;
	}
	
	// Publication MessagingLinks to the same MessageBroker are merged, combining their topics
	@Override
	public void addPublication(Linkable mB, List<String> topics) {
		publicationLinks.merge(mB, topics, (s1,s2)->mergeStringLists(s1, s2));
		System.out.println("    🟥 Scaffolding added new Publication on " + topics.toString() +" to "+ mB.toString());
	}
	
	// Subscription MessagingLinks to the same MessageBroker are merged, combining their topics
	@Override
	public void addSubscription(Linkable mB, List<String> topics) {
		subscriptionLinks.merge(mB, topics, (s1,s2)->mergeStringLists(s1, s2));
		System.out.println("    🟦 Scaffolding added new Subscription on " + topics.toString() +" to "+ mB.toString());
	}

	public void addMessageToOutgoingCache(String topic, String msgContent, String recipient) {
		msgOutCache.add(topic + "-" + recipient + "-" + msgContent);
	}
	
	public void addMessageToOutgoingCache(String topic, String msgContent) {
		msgOutCache.add(topic + "--" + msgContent);
	}
	
	public void sendMessage(Linkable mB, String msg){
		mB.queueMessage(msg);
	}
	
	public void sendMessages() {
		for (Entry<Linkable, List<String>> link : publicationLinks.entrySet()) {
			for (String msgOut: msgOutCache){
				if (link.getValue().contains(msgOut.split("-")[0])){
					sendMessage(link.getKey(), msgOut);
				}
			}
		}
	}

	@Override
	public String queryMessages() {
		for (Entry<Linkable, List<String>> link : subscriptionLinks.entrySet()) {
			for (String topic: this.getTopics()){
				msgCache.addAll(link.getKey().retrieveMessages(topic, this.name));
			}
		};
		return null;
	}
	
	public void routeMessages() {
		for (String msg : msgCache) {
			String msgContent = msg.split("-")[2];
			String msgComponent = msgContent.split("\\.")[0];
			String msgFunction = msgContent.split("\\.")[1];
			String msgFunctionName = msgFunction.split("\\(")[0];
			String[] msgFunctionParameters = {""};
			if (!msgFunction.split("\\(")[1].equals(")")) {
				String msgFunctionParametersConcatenated = msgFunction.split("\\(")[1].split("\\)")[0];
				msgFunctionParameters = msgFunctionParametersConcatenated.split(",");
			}
			switch (msgComponent) {
			case "scanner":
						switch (msgFunctionName) {
							case "getContent":
								String compReturn = this.scanner.getContent();
								addMessageToOutgoingCache(scanner.getTopic(), "scanner.getContent() -> "+compReturn);
								break;
						}
				break;
			default:
				break;
			}
		}
	}
	
	public List<String> getTopics(){
		Set<String> topics = new HashSet<>();
		topics.add(scanner.getTopic());
		return new ArrayList<>(topics);
	}
	public String getName() {
		return name;
	}
	
	public void step(){
		msgCache.clear();
		msgOutCache.clear();
		
		queryMessages();
		routeMessages();
		
		scanner.step(msgOutCache);
		
		sendMessages();
	}

}
