package com.polban.tekpro.monopoly;

public class GoCell extends Cell {
	protected Player owner;

	public GoCell() {
		super.setName("Go");

	}

	public void playAction() {
	}
	
	void setName(String name) {
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player player) {
		this.owner = player;
	}
}
