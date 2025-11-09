package com.artaleBot.service;

import tools.jackson.databind.ObjectMapper;

public class JSONMapperService {
	
	public JSONMapperService() {
		
	}
	
	ObjectMapper mapper = new ObjectMapper();
	
	
	public void determineProperOutput(String content) {
		
		
		if (content.contains("")) {
			printMobInformation(content);
		}
		
		if (content.contains("")) {
			printBossInformation(content);
		}
		
		if (content.contains("")) {
			printEquipmentInformation(content);
		}
		
		
	}
	
	private void printMobInformation(String content) {
		
	}
	
	private void printBossInformation(String content) {
		
	}
	
	private void printEquipmentInformation(String content) {
		
	}
}
