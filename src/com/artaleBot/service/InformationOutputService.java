package com.artaleBot.service;


import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.json.JsonMapper;

public class InformationOutputService {
	
	public InformationOutputService() {
		
	}	
	
	PojoCreator pojoCreator = new PojoCreator();
	
	ObjectMapper mapper = JsonMapper.builder().build();
	
	//Checks which kind of entity needs to be made
	public void determineProperOutput(String content) {
		
		
		if (content.contains("mobName")) {
			printMobInformation(content);
		}
		
		if (content.contains("bossName")) {
			printBossInformation(content);
		}
		
		if (content.contains("equipmentName")) {
			printEquipmentInformation(content);
		}
		
		
	}
	

	//Method that creates an Mob record
	private void printMobInformation(String content) {
		
		JsonNode mobInfo = mapper.readTree(content);
		
		pojoCreator.mobCreator(mobInfo);
		
		
	}
	
	//Method that creates an Boss record
	private void printBossInformation(String content) {
		JsonNode bossInfo = mapper.readTree(content);
		
		pojoCreator.bossCreator(bossInfo);
	}
	
	//Method that creates an Equipment record
	private void printEquipmentInformation(String content) {
		JsonNode equipmentInfo = mapper.readTree(content);
		
		pojoCreator.equipmentCreator(equipmentInfo);
	}
}
