package com.artaleBot.dto;

public record Mob(String mobName, int mobLevel, int mobHP, int mobMP, int mobEXP, int mobMinMeso, int mobMaxMeso, int mobNeededAccuracy, String mobLocation, String mobLocationTwo) {
	

	@Override
	public String toString() {
		
		if (this.mobLocationTwo.equals("")) {
		
			return "Mob Name: " + this.mobName + "\n" +
					"Mob Level: " + this.mobLevel + "\n" +
					"Mob HP: " + this.mobHP + "\n" + 
					"Mob MP: " + this.mobMP + "\n" +
					"Mob Meso: " + this.mobMinMeso + "~" + this.mobMaxMeso + "\n" +
					"Mob Accuracy need to hit: " + this.mobNeededAccuracy + "\n" + 
					"Mob Location: " + this.mobLocation + "\n";
		} else {
			return "Mob Name: " + this.mobName + "\n" +
					"Mob Level: " + this.mobLevel + "\n" +
					"Mob HP: " + this.mobHP + "\n" + 
					"Mob MP: " + this.mobMP + "\n" +
					"Mob Meso: " + this.mobMinMeso + "~" + this.mobMaxMeso + "\n" +
					"Mob Accuracy need to hit: " + this.mobNeededAccuracy + "\n" + 
					"Mob Location: " + this.mobLocation + "\n" +
					"Mob Location Two: " + this.mobLocationTwo + "\n";
		}

		
	}
	
}



