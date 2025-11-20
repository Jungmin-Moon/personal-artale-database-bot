package com.artaleBot.service;

import com.artaleBot.dto.Boss;
import com.artaleBot.dto.Mob;
import com.artaleBot.dto.Equipment;

import tools.jackson.databind.JsonNode;

public class PojoCreator {

	public PojoCreator() {
		super();
	}
	
	
	public void mobCreator(JsonNode mobInfo) {
		
		Mob searchedMob = new Mob(mobInfo.get("mobName").asString(), mobInfo.get("mobLevel").asInt(), mobInfo.get("mobHP").asInt(),
									mobInfo.get("mobMP").asInt(), mobInfo.get("mobEXP").asInt(), mobInfo.get("mobMinMeso").asInt(), mobInfo.get("mobMaxMeso").asInt(),
									mobInfo.get("mobNeededAccuracy").asInt(), mobInfo.get("mobLocation").asString(), mobInfo.get("mobLocationTwo").asString());
		
		
		System.out.println(searchedMob.toString());
		
		
	}
	
	
	public void bossCreator(JsonNode bossInfo) {
		Boss searchedBoss = new Boss(bossInfo.get("bossName").asString(), bossInfo.get("bossLevel").asInt(), bossInfo.get("bossHP").asInt(),
									bossInfo.get("bossMinRespawn").asInt(), bossInfo.get("bossMaxRespawn").asInt(), bossInfo.get("bossLocation").asString());
		
		
		System.out.println(searchedBoss.toString());
	}
	
	public void equipmentCreator(JsonNode equipmentInfo) {
		Equipment searchedEquipment = new Equipment(equipmentInfo.get("equipmentName").asString(), equipmentInfo.get("equipmentType").asString(), equipmentInfo.get("minimumLevel").asInt(), equipmentInfo.get("weaponAtt").asString(), 
				equipmentInfo.get("magicAtt").asString(), equipmentInfo.get("attSpeed").asString(), equipmentInfo.get("weaponDef").asString(), equipmentInfo.get("magicDef").asString(), equipmentInfo.get("warrior").asInt(), 
				equipmentInfo.get("magician").asInt(), equipmentInfo.get("thief").asInt(), equipmentInfo.get("pirate").asInt(), equipmentInfo.get("archer").asInt(), equipmentInfo.get("common").asInt(), equipmentInfo.get("beginner").asInt(), 
				equipmentInfo.get("requiredStr").asInt(), equipmentInfo.get("requiredDex").asInt(), equipmentInfo.get("requiredInt").asInt(), equipmentInfo.get("requiredLuk").asInt());
		
		
		System.out.println(searchedEquipment.toString());
	}
}
