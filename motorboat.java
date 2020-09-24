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
	public float costOfRepair() {
		return 1200.50F;
	}
	
	public int getDeckArea() {
		return deckArea;
	}

	public void setDeckArea(int deckArea) {
		this.deckArea = deckArea;
	}

	
}

