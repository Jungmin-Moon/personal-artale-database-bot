package com.artaleBot.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import com.artaleBot.commands.Commands;

public class CommandCheckService {
	
	Commands commandCenter = new Commands();
	
	public CommandCheckService() {
		
	}
	
	
	public String checkCommandType(String command) {
		
		String noExclamation = command.substring(1).toLowerCase();
		
		String[] values = command.split(" ");
		
		String commandNoExclamationPoint = values[0].substring(1);
		
		String response = "";
		
		
		switch(commandNoExclamationPoint) {
			case "mob" -> response = commandCenter.mobCommand(noExclamation.substring(4));
			case "boss" -> response = commandCenter.bossCommand(noExclamation.substring(5));
			case "equipment" -> response = commandCenter.equipmentCommand(noExclamation.substring(10));
			case "mobdrop" -> response = commandCenter.mobDropCommand(noExclamation.substring(8));
			case "bossdrop" -> response = commandCenter.bossDropCommand(noExclamation.substring(9));
			case "help" -> response = commandCenter.helpCommand();
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
}
