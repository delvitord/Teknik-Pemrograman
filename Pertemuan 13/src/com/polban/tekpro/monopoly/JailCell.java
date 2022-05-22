package com.polban.tekpro.monopoly;

public class JailCell extends Cell {
	public static int BAIL = 50;
	protected Player owner;
	
	public JailCell() {
		setName("Jail");
	}
	
	public void playAction() {
		
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player player) {
		this.owner = player;
	}
}
