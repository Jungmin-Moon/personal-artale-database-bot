package com.artaleBot.pojo;

public class Equipment {
	
	private String equipmentName;
	
	private String equipmentType;
	
	private int minimumLevel;
	
	private String weaponAtt;
	
	private String magicAtt;
	
	private String attSpeed;
	
	private String weaponDef;
	
	private String magicDef;
	
	private int warrior;
	private int magician;
	private int thief;
	private int pirate;
	private int common;
	private int beginner;
	
	private int requiredStr;
	private int requiredDex;
	private int reqruiredInt;
	private int requiredLuk;
	
	
	public Equipment(String equipmentName, String equipmentType, int minimumLevel, String weaponAtt, String magicAtt,
			String attSpeed, String weaponDef, String magicDef, int warrior, int magician, int thief, int pirate,
			int common, int beginner, int requiredStr, int requiredDex, int reqruiredInt, int requiredLuk) {
		super();
		this.equipmentName = equipmentName;
		this.equipmentType = equipmentType;
		this.minimumLevel = minimumLevel;
		this.weaponAtt = weaponAtt;
		this.magicAtt = magicAtt;
		this.attSpeed = attSpeed;
		this.weaponDef = weaponDef;
		this.magicDef = magicDef;
		this.warrior = warrior;
		this.magician = magician;
		this.thief = thief;
		this.pirate = pirate;
		this.common = common;
		this.beginner = beginner;
		this.requiredStr = requiredStr;
		this.requiredDex = requiredDex;
		this.reqruiredInt = reqruiredInt;
		this.requiredLuk = requiredLuk;
	}


	public String getEquipmentName() {
		return equipmentName;
	}


	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}


	public String getEquipmentType() {
		return equipmentType;
	}


	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}


	public int getMinimumLevel() {
		return minimumLevel;
	}


	public void setMinimumLevel(int minimumLevel) {
		this.minimumLevel = minimumLevel;
	}


	public String getWeaponAtt() {
		return weaponAtt;
	}


	public void setWeaponAtt(String weaponAtt) {
		this.weaponAtt = weaponAtt;
	}


	public String getMagicAtt() {
		return magicAtt;
	}


	public void setMagicAtt(String magicAtt) {
		this.magicAtt = magicAtt;
	}


	public String getAttSpeed() {
		return attSpeed;
	}


	public void setAttSpeed(String attSpeed) {
		this.attSpeed = attSpeed;
	}


	public String getWeaponDef() {
		return weaponDef;
	}


	public void setWeaponDef(String weaponDef) {
		this.weaponDef = weaponDef;
	}


	public String getMagicDef() {
		return magicDef;
	}


	public void setMagicDef(String magicDef) {
		this.magicDef = magicDef;
	}


	public int getWarrior() {
		return warrior;
	}


	public void setWarrior(int warrior) {
		this.warrior = warrior;
	}


	public int getMagician() {
		return magician;
	}


	public void setMagician(int magician) {
		this.magician = magician;
	}


	public int getThief() {
		return thief;
	}


	public void setThief(int thief) {
		this.thief = thief;
	}


	public int getPirate() {
		return pirate;
	}


	public void setPirate(int pirate) {
		this.pirate = pirate;
	}


	public int getCommon() {
		return common;
	}


	public void setCommon(int common) {
		this.common = common;
	}


	public int getBeginner() {
		return beginner;
	}


	public void setBeginner(int beginner) {
		this.beginner = beginner;
	}


	public int getRequiredStr() {
		return requiredStr;
	}


	public void setRequiredStr(int requiredStr) {
		this.requiredStr = requiredStr;
	}


	public int getRequiredDex() {
		return requiredDex;
	}


	public void setRequiredDex(int requiredDex) {
		this.requiredDex = requiredDex;
	}


	public int getReqruiredInt() {
		return reqruiredInt;
	}


	public void setReqruiredInt(int reqruiredInt) {
		this.reqruiredInt = reqruiredInt;
	}


	public int getRequiredLuk() {
		return requiredLuk;
	}


	public void setRequiredLuk(int requiredLuk) {
		this.requiredLuk = requiredLuk;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
