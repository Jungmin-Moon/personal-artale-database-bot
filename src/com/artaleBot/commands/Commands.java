package com.artaleBot.commands;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Commands {

	public Commands() {
		
	}
	
	private String url = "http://localhost:8080/";
	private HttpClient client = HttpClient.newHttpClient();
	
	public String mobCommand(String mob) {
			
			//String mobUrl = "http://localhost:8080/mobs/";
			//HttpClient client = HttpClient.newHttpClient();
		
			System.out.println(mob);
		
			HttpRequest request = HttpRequest.newBuilder()
									.uri(URI.create(url + "mobs/" + mob))
									.timeout(Duration.ofMinutes(1))
									.header("Content-Type", "application/json")
									.GET()
									.build();
	
			
			CompletableFuture<Object> response = client.sendAsync(request, BodyHandlers.ofString())
													.thenApply(HttpResponse::body);
			
			String output = "";
			
			try {
				output = response.get().toString();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return output;
			
	}
	
	
	public String bossCommand(String boss) {
		return "Placeholder Text";
	}
	
	public String equipmentCommand(String equipment) {
		return "Placeholder Text";
	}
	
	public String mobDropCommand(String mobDrop) {
		return "Placeholder Text";
	}
	
	public String bossDropCommand(String bossDrop) {
		return "Placeholder Text";
	}
	
	
	public String helpCommand() {
		return "The available commands are:\n " + 
		"Note: spelling matters for the search item after the command and a space should be between the command and the search item like in the examples.\n" +
		"!mob: gets information about a mob. Example: !mob Wild Kargo\n" +
		"!boss: gets information about a boss. Example: !boss Mano\n" +
		"!equipment: gets information about a piece of equipment. Example: !equipment Shinkita\n" +
		"!mobdrop: gets information about what mob drops the equipment you are looking for. Example: !mobdrop Blue Ice Queen Skirt\n" +
		"!bossdrop: gets information about what boss drops the equipment you are looking for. Example: !bossdrop Cromi\n" +
		"!help: lists the available commands.";
	}
}
