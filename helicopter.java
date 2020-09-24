package main;

public class helicopter extends vehicle {
	
	private int noOfBlades ;
	private boolean hasParachutes; 
		
		public helicopter() {
			super();
		}

		public helicopter(int vehWeight, int noOfWindows, String colour, int noOfBlades, boolean hasParachutes) {
			super(vehWeight, noOfWindows, colour);
			this.noOfBlades = noOfBlades;
			this.hasParachutes = hasParachutes;
			
		}
		
		@Override
		public int costOfRepair() {
			return (2500 + (getNoOfBlades() *  500) ) ;
		}

		public int getNoOfBlades() {
			return noOfBlades;
		}

		public void setNoOfBlades(int noOfBlades) {
			this.noOfBlades = noOfBlades;
		}

		public boolean isHasParachutes() {
			return hasParachutes;
		}

		public void setHasParachutes(boolean hasParachutes) {
			this.hasParachutes = hasParachutes;
		}
	
}

