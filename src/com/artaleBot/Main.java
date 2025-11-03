package com.artaleBot;

import java.util.Scanner;

import com.artaleBot.service.CommandCheckService;

public class Main {
	
	public static void main(String[] args) {
		
		CommandCheckService commandCheckService = new CommandCheckService();
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Welcome to the easy user interface for querying the Artale Database.");
			System.out.println("Enter a command to begin.");
			System.out.println("Enter !help to get a list of commands and what they do.");
			
			String userInput = input.nextLine();
			
			while (!userInput.equalsIgnoreCase("!end")) {
				
				if (!commandCheckService.validateCommand(userInput)) {
					
					System.out.println("That is not a valid command. Type !help for a list of commands.");
					
				} else {
					commandCheckService.checkCommandType(userInput);
				}
				
				userInput = input.nextLine();
			}
			
		}
		
		
		
	}

}
