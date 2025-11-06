package com.artaleBot.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public class CommandCheckService {
	
	public String checkCommandType(String command) {
		
		String noExclamation = command.substring(1).toLowerCase();
		
		String[] values = command.split(" ");
		
		String commandNoExclamationPoint = values[0].substring(1);
		
		String response = "";
		
		switch(commandNoExclamationPoint) {
			case "mob" -> response = mobCommand(noExclamation.substring(4));
			case "boss" -> response = bossCommand(noExclamation.substring(5));
			case "equipment" -> response = equipmentCommand(noExclamation.substring(10));
			case "mobdrop" -> response = mobDropCommand(noExclamation.substring(8));
			case "bossdrop" -> response = bossDropCommand(noExclamation.substring(9));
			case "help" -> response = helpCommand();
		}
		
		return response;
		
	}
	
	public boolean validateCommand(String command) {
		boolean validCommand = false;
		
		String[] values = command.split(" ");
		
		String commandNoExclamationPoint = values[0].substring(1);
		
		switch (commandNoExclamationPoint) {
			case "mob" -> validCommand = true;
			case "boss" -> validCommand = true;
			case "equipment" -> validCommand = true;
			case "mobdrop" -> validCommand = true;
			case "bossdrop" -> validCommand = true;
			case "help" -> validCommand = true;
		}
		
		return validCommand;
	}
	
	private String mobCommand(String mob) {
		
		String mobUrl = "http://localhost:8080/mobs/";
		HttpClient client = HttpClient.newHttpClient();
	
		HttpRequest request = HttpRequest.newBuilder()
								.uri(URI.create(mobUrl + mob))
								.timeout(Duration.ofMinutes(1))
								.header("Content-Type", "application/json")
								.GET()
								.build();

		
		CompletableFuture<Object> response = client.sendAsync(request, BodyHandlers.ofString())
												.thenApply(HttpResponse::body);
		
		return response.toString();
		
	}
	
	private String bossCommand(String boss) {
		return "Placeholder Text";
	}
	
	private String equipmentCommand(String equipment) {
		return "Placeholder Text";
	}
	
	private String mobDropCommand(String mobDrop) {
		return "Placeholder Text";
	}
	
	private String bossDropCommand(String bossDrop) {
		return "Placeholder Text";
	}
	
	private String helpCommand() {
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
