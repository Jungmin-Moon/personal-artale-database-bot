package com.artaleBot.dto;

public record Boss(String bossName, int bossLevel, int bossHP, int bossMaxRespawn, int bossMinRespawn, String bossLocation) {
	
	@Override
	public String toString() {
		return "Boss Name: " + this.bossName + "\n" +
				"Boss Level: " + this.bossLevel + "\n" +
				"Boss HP: " + this.bossHP + "\n" + 
				"Boss Respawn Time: " + this.convertMinRespawnTohours() + " hours and " + this.convertMinToMinutes() + " minutes to " + 
				this.convertMaxRespawnToHours() + " hours and " + this.convertMaxToMinutes() + " minutes" + "\n" + 
				"Boss Location: " + this.bossLocation;
	}
	
	private int convertMaxRespawnToHours() {
		return this.bossMaxRespawn / 60;
	}
	
	private int convertMinRespawnTohours() {
		return this.bossMinRespawn / 60;
	}
	
	private int convertMaxToMinutes() {
		return this.bossMaxRespawn % 60;
	}
	
	private int convertMinToMinutes() {
		return this.bossMinRespawn % 60;
	}
	
}
