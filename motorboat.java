package main;

public class motorboat extends vehicle {
	
	private int deckArea;
	
	public motorboat() {
		super();
	}

	public motorboat(int vehWeight, int noOfWindows, String colour, int deckArea) {
		super(vehWeight, noOfWindows, colour);
		this.deckArea = deckArea;
		
	}
	
	@Override
	public int costOfRepair() {
		return (1200 + (getDeckArea()*20));
	}
	
	public int getDeckArea() {
		return deckArea;
	}

	public void setDeckArea(int deckArea) {
		this.deckArea = deckArea;
	}

	
}

