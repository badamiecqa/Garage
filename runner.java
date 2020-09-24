package main;

import java.util.ArrayList;
import java.util.List;

public class runner {

	public static void main (String[] args) {
		
		vehicle Boat1 = new motorboat(450, 12, "blue", 40);
		vehicle Helicopter1 = new helicopter(1000, 7, "green", 6, false);
		vehicle Lorry1 = new lorry(500, 3, "white", 30, true);
		
		garage Garage = new garage();
		List<vehicle> vehs = new ArrayList<>();
		
		vehs.add(Boat1);
		vehs.add(Helicopter1);
		vehs.add(Lorry1);
		
        	//Printing the garage
        	for(vehicle obj : vehs) 
              { System.out.println(obj);
        		
        	} 
        
		
		
		
		
		
	}
}
