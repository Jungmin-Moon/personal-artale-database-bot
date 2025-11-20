package com.artaleBot.dto;

public record Equipment(String equipmentName, String equipmentType, int minimumLevel, String weaponAtt, String magicAtt, String attSpeed, String weaponDef, String magicDef,
						int warrior, int magician, int thief, int pirate, int archer, int common, int beginner, int requiredStr, int requiredDex, int requiredInt, int requiredLuk) {

	
	//att_speed can be N/A
	/*
	 * equipmentName is a varchar
	 * equipmentType is a varchar
	 * weaponAtt is a varchar
	 * magicAtt is a varchar
	 * attSpeed is a varchar
	 * weaponDef is a varchar
	 * magicDef is a varchar
	 */
	
	
	//need to test if statements
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		str.append("Equipment Name: " + this.equipmentName + "\n");
		str.append("Equipment Type: " + this.equipmentType + "\n");
		str.append("Minimum Level needed: " + this.minimumLevel + "\n");
		
		if (!(this.weaponAtt.equalsIgnoreCase("0") || this.weaponAtt.equalsIgnoreCase(""))) {
			str.append("Weapon Attack: " + this.weaponAtt + "\n");
		} 
		
		if (!(this.magicAtt.equalsIgnoreCase("0") || this.magicAtt.equalsIgnoreCase(""))) {
			str.append("Magic Attack: " + this.magicAtt + "\n");
		} 
		
		if (!this.attSpeed.equalsIgnoreCase("N/A")) {
			str.append("Attack Speed: " + this.attSpeed + "\n");
		}
		
		if (!(this.weaponDef.equalsIgnoreCase("0") || this.weaponDef.equalsIgnoreCase(""))) {
			str.append("Weapon Def: " + this.weaponDef + "\n");			
		}
		
		if (!(this.magicDef.equalsIgnoreCase("0") || this.magicDef.equalsIgnoreCase(""))) {
			str.append("Magic Def: " + this.magicDef + "\n");
		}
		
		str.append(this.equippableClasses());
		
		
		if (this.requiredStr > 0) {
			str.append("Required STR: " + this.requiredStr + "\n");
		}
		
		if (this.requiredDex > 0) {
			str.append("Required DEX: " + this.requiredDex + "\n");
		}
		
		if (this.requiredInt > 0) {
			str.append("Required INT: " + this.requiredInt + "\n");
		}
		
		if (this.requiredLuk > 0) {
			str.append("Required LUK: " + this.requiredLuk + "\n");
		}
		
		return str.toString();
	}
	
	private String equippableClasses() {
		StringBuilder classesThatCanEquip = new StringBuilder();
		
		classesThatCanEquip.append("Equippable By: [");
		
		if (this.common == 1) {
			
			classesThatCanEquip.append("ALL");
			
		} else {
			
			if (this.warrior == 1) {
				classesThatCanEquip.append("WARRIOR ");
			}
			
			if (this.magician == 1) {
				classesThatCanEquip.append("MAGICIAN ");
			}
			
			if (this.thief == 1) {
				classesThatCanEquip.append("THIEF ");
			}
			
			if (this.archer == 1) {
				classesThatCanEquip.append("ARCHER ");
			}
			
			if (this.pirate == 1) {
				classesThatCanEquip.append("PIRATE ");
			}
			
			if (this.beginner == 1) {
				classesThatCanEquip.append("BEGINNER ");
			}
		}
		
		String stringListingWhoCanEquip = classesThatCanEquip.toString();
		
		stringListingWhoCanEquip.trim();
		
		stringListingWhoCanEquip = stringListingWhoCanEquip + "]";
		
		return stringListingWhoCanEquip;
	}
}
