package com.artaleBot.service;


import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.json.JsonMapper;

public class InformationOutputService {
	
	public InformationOutputService() {
		
	}	
	
	PojoCreator pojoCreator = new PojoCreator();
	
	ObjectMapper mapper = JsonMapper.builder().build();
	
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
	
	//genuinely do not understand why the POJO mapping isn't working, why is there a access to public member failed issue
	//{"id":1,"mobName":"Snail","mobLevel":1,"mobHP":8,"mobMP":0,"mobEXP":3,"mobMinMeso":4,"mobMaxMeso":6,"mobNeededAccuracy":0,"mobLocation":"Victoria Island","mobLocationTwo":""}
	private void printMobInformation(String content) {
		
		JsonNode mobInfo = mapper.readTree(content);
		
		pojoCreator.mobCreator(mobInfo);
		
		
	}
	
	private void printBossInformation(String content) {
		JsonNode bossInfo = mapper.readTree(content);
		
		pojoCreator.bossCreator(bossInfo);
	}
	
	private void printEquipmentInformation(String content) {
		JsonNode equipmentInfo = mapper.readTree(content);
		System.out.println(content);
		pojoCreator.equipmentCreator(equipmentInfo);
	}
}
