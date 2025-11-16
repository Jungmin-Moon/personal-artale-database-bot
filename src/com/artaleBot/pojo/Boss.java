package com.artaleBot.pojo;

public class Boss {
	
	private long id;
	
	private String bossName;
	
	private int bossLevel;
	
	private int bossHP;
	
	private int bossMaxRespawn;
	
	private int bossMinRespawn;
	
	private String bossLocation;

	public Boss(long id, String bossName, int bossLevel, int bossHP, int bossMaxRespawn, int bossMinRespawn,
			String bossLocation) {
		super();
		this.id = id;
		this.bossName = bossName;
		this.bossLevel = bossLevel;
		this.bossHP = bossHP;
		this.bossMaxRespawn = bossMaxRespawn;
		this.bossMinRespawn = bossMinRespawn;
		this.bossLocation = bossLocation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBossName() {
		return bossName;
	}

	public void setBossName(String bossName) {
		this.bossName = bossName;
	}

	public int getBossLevel() {
		return bossLevel;
	}

	public void setBossLevel(int bossLevel) {
		this.bossLevel = bossLevel;
	}

	public int getBossHP() {
		return bossHP;
	}

	public void setBossHP(int bossHP) {
		this.bossHP = bossHP;
	}

	public int getBossMaxRespawn() {
		return bossMaxRespawn;
	}

	public void setBossMaxRespawn(int bossMaxRespawn) {
		this.bossMaxRespawn = bossMaxRespawn;
	}

	public int getBossMinRespawn() {
		return bossMinRespawn;
	}

	public void setBossMinRespawn(int bossMinRespawn) {
		this.bossMinRespawn = bossMinRespawn;
	}

	public String getBossLocation() {
		return bossLocation;
	}

	public void setBossLocation(String bossLocation) {
		this.bossLocation = bossLocation;
	}
	
	@Override
	public String toString() {
		return "Boss Name: " + this.getBossName() + "\n" +
				"Boss Level: " + this.getBossLevel() + "\n" +
				"Boss HP: " + this.getBossHP() + "\n" + 
				"Boss Respawn Time: " + this.convertMinRespawnTohours() + " hours and " + this.convertMinToMinutes() + " minutes to " + 
				this.convertMaxRespawnToHours() + " hours and " + this.convertMaxToMinutes() + " minutes" + "\n" + 
				"Boss Location: " + this.getBossLocation();
	}
	
	private int convertMaxRespawnToHours() {
		return this.getBossMaxRespawn() / 60;
	}
	
	private int convertMinRespawnTohours() {
		return this.getBossMinRespawn() / 60;
	}
	
	private int convertMaxToMinutes() {
		return this.getBossMaxRespawn() % 60;
	}
	
	private int convertMinToMinutes() {
		return this.getBossMinRespawn() % 60;
	}
}
