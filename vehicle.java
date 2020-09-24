package main;

public class vehicle {

	private int vehWeight;
	private int noOfWindows;
	private String colour;

	public vehicle() {
		super();
	}

	public vehicle(int vehWeight, int noOfWindows, String colour) {
		super();
		this.vehWeight = vehWeight;
		this.noOfWindows = noOfWindows;
		this.colour = colour;

	}

	public int costOfRepair() {
		return 50;
	}

	public int getVehWeight() {
		return vehWeight;
	}

	public void setVehWeight(int vehWeight) {
		this.vehWeight = vehWeight;
	}

	public int getNoOfWindows() {
		return noOfWindows;
	}

	public void setNoOfWindows(int noOfWindows) {
		this.noOfWindows = noOfWindows;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
