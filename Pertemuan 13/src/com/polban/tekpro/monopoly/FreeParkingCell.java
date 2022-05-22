package com.polban.tekpro.monopoly;

public class FreeParkingCell extends Cell {

	protected Player owner;

	public FreeParkingCell() {
		setName("Free Parking");
	}

	public void playAction() {
		return;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player player) {
		this.owner = player;
	}
}
