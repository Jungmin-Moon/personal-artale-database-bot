package com.artaleBot.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class CommandCheckService {
	
	public void checkCommandType(String command) {
		
		String noExclamation = command.substring(1).toLowerCase();
		
		String[] values = command.split(" ");
		
		String commandNoExclamationPoint = values[0].substring(1);
		
		switch(commandNoExclamationPoint) {
			case "mob" -> mobCommand(noExclamation.substring(4));
			case "boss" -> bossCommand(noExclamation.substring(5));
			case "equipment" -> equipmentCommand(noExclamation.substring(10));
			case "mobdrop" -> mobDropCommand(noExclamation.substring(8));
			case "bossdrop" -> bossDropCommand(noExclamation.substring(9));
			case "help" -> helpCommand();
		}
		
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
	
	private void mobCommand(String mob) {
		
		String mobUrl = "http://localhost:8080/mobs/";
		HttpClient client = HttpClient.newHttpClient();
	
		HttpRequest request = HttpRequest.newBuilder()
								.uri(URI.create(mobUrl + mob))
								.timeout(Duration.ofMinutes(1))
								.header("Content-Type", "application/json")
								.GET()
								.build();

		String result = "";
		
		client.sendAsync(request, BodyHandlers.ofString())
						.thenApply(HttpResponse::body)
						.thenAccept(System.out::println);
		
		
		
	}
	
	private void bossCommand(String boss) {
		
	}
	
	private void equipmentCommand(String equipment) {
		
	}
	
	private void mobDropCommand(String mobDrop) {
		
	}
	
	private void bossDropCommand(String bossDrop) {
		
	}
	
	private void helpCommand() {
		System.out.println("The available commands are: ");
		System.out.println("Note: spelling matters for the search item after the command and a space should be between the command and the search item like in the examples.");
		System.out.println("!mob: gets information about a mob. Example: !mob Wild Kargo");
		System.out.println("!boss: gets information about a boss. Example: !boss Mano");
		System.out.println("!equipment: gets information about a piece of equipment. Example: !equipment Shinkita");
		System.out.println("!mobdrop: gets information about what mob drops the equipment you are looking for. Example: !mobdrop Blue Ice Queen Skirt");
		System.out.println("!bossdrop: gets information about what boss drops the equipment you are looking for. Example: !bossdrop Cromi");
		System.out.println("!help: lists the available commands.");
	}
}
