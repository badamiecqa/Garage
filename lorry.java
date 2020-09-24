package main;

public class lorry extends vehicle {
	
private int lorrylength ;
private boolean hasCargo; 
	
	public lorry() {
		super();
	}

	public lorry(int vehWeight, int noOfWindows, String colour, int lorrylength, boolean hasCargo) {
		super(vehWeight, noOfWindows, colour);
		this.lorrylength = lorrylength;
		this.hasCargo = hasCargo;
		
	}
	
	@Override
	public int costOfRepair() {
		int init = 500;
		if(hasCargo) { init += 700;
			
		} else {init += 50;}
		
		return init;
	}

	public int getLorrylength() {
		return lorrylength;
	}

	public void setLorrylength(int lorrylength) {
		this.lorrylength = lorrylength;
	}

	public boolean isHasCargo() {
		return hasCargo;
	}

	public void setHasCargo(boolean hasCargo) {
		this.hasCargo = hasCargo;
	}

}
