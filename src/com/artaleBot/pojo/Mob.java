package com.artaleBot.pojo;

public class Mob {

	private long id;

	private String mobName;
	
	private int mobLevel;

	private int mobHP;

	private int mobMP;

	private int mobEXP;

	private int mobMinMeso;

	private int mobMaxMeso;

	private int mobNeededAccuracy;

	private String mobLocation;

	private String mobLocationTwo;
	
	public Mob() {
		
	}
	
	
	
	public Mob(long id, String mobName, int mobLevel, int mobHP, int mobMP, int mobEXP, int mobMinMeso, int mobMaxMeso,
			int mobNeededAccuracy, String mobLocation, String mobLocationTwo) {
		super();
		this.id = id;
		this.mobName = mobName;
		this.mobLevel = mobLevel;
		this.mobHP = mobHP;
		this.mobMP = mobMP;
		this.mobEXP = mobEXP;
		this.mobMinMeso = mobMinMeso;
		this.mobMaxMeso = mobMaxMeso;
		this.mobNeededAccuracy = mobNeededAccuracy;
		this.mobLocation = mobLocation;
		this.mobLocationTwo = mobLocationTwo;
	}



	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getMobName() {
		return mobName;
	}


	public void setMobName(String mobName) {
		this.mobName = mobName;
	}


	public int getMobLevel() {
		return mobLevel;
	}


	public void setMobLevel(int mobLevel) {
		this.mobLevel = mobLevel;
	}


	public int getMobHP() {
		return mobHP;
	}


	public void setMobHP(int mobHP) {
		this.mobHP = mobHP;
	}


	public int getMobMP() {
		return mobMP;
	}


	public void setMobMP(int mobMP) {
		this.mobMP = mobMP;
	}


	public int getMobEXP() {
		return mobEXP;
	}


	public void setMobEXP(int mobEXP) {
		this.mobEXP = mobEXP;
	}


	public int getMobMinMeso() {
		return mobMinMeso;
	}


	public void setMobMinMeso(int mobMinMeso) {
		this.mobMinMeso = mobMinMeso;
	}


	public int getMobMaxMeso() {
		return mobMaxMeso;
	}


	public void setMobMaxMeso(int mobMaxMeso) {
		this.mobMaxMeso = mobMaxMeso;
	}


	public int getMobNeededAccuracy() {
		return mobNeededAccuracy;
	}


	public void setMobNeededAccuracy(int mobNeededAccuracy) {
		this.mobNeededAccuracy = mobNeededAccuracy;
	}


	public String getMobLocation() {
		return mobLocation;
	}


	public void setMobLocation(String mobLocation) {
		this.mobLocation = mobLocation;
	}


	public String getMobLocationTwo() {
		return mobLocationTwo;
	}


	public void setMobLocationTwo(String mobLocationTwo) {
		this.mobLocationTwo = mobLocationTwo;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
