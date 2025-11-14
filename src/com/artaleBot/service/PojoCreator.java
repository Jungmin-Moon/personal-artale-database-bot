package com.artaleBot.service;

import com.artaleBot.pojo.Mob;

import tools.jackson.databind.JsonNode;

public class PojoCreator {

	public PojoCreator() {
		super();
	}
	
	
	public void mobCreator(JsonNode mobInfo) {
		
		Mob searchedMob = new Mob(mobInfo.get("id").asLong(), mobInfo.get("mobName").asString(), mobInfo.get("mobLevel").asInt(), mobInfo.get("mobHP").asInt(),
									mobInfo.get("mobMP").asInt(), mobInfo.get("mobEXP").asInt(), mobInfo.get("mobMinMeso").asInt(), mobInfo.get("mobMaxMeso").asInt(),
									mobInfo.get("mobNeededAccuracy").asInt(), mobInfo.get("mobLocation").asString(), mobInfo.get("mobLocationTwo").asString());
		
		
		System.out.println(searchedMob.toString());
		
		
	}
	
	
	public void bossCreator(JsonNode bossInfo) {
		
	}
}
