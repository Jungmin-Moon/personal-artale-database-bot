package com.artaleBot.service;

import com.artaleBot.pojo.Mob;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.json.JsonMapper;

public class JSONMapperService {
	
	public JSONMapperService() {
		
	}	
	
	ObjectMapper mapper = JsonMapper.builder().build();
	
	public void determineProperOutput(String content) {
		
		
		if (content.contains("mobName")) {
			printMobInformation(content);
		}
		
		if (content.contains("bossName")) {
			printBossInformation(content);
		}
		
		if (content.contains("equimentName")) {
			printEquipmentInformation(content);
		}
		
		
	}
	
	//genuinely do not understand why the POJO mapping isn't working, why is there a access to public member failed issue
	
	private void printMobInformation(String content) {
		
		System.out.println(content);
		JsonNode mobInfo = mapper.readTree(content);
		System.out.println(mobInfo.get("mobName").asString());
		
		
		//Mob mobInfo2 = mapper.reader().forType(Mob.class).readValue(content);
		
		//System.out.println(mobInfo.toString());
	}
	
	private void printBossInformation(String content) {
		
	}
	
	private void printEquipmentInformation(String content) {
		
	}
}
