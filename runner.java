package main;

import java.util.ArrayList;
import java.util.List;

public class runner {

	public static void main(String[] args) {

		vehicle Boat1 = new motorboat(450, 12, "blue", 40);
		vehicle Helicopter1 = new helicopter(1000, 7, "green", 6, false);
		vehicle Lorry1 = new lorry(500, 3, "white", 30, true);

		List<vehicle> vehs = new ArrayList<>();

		vehs.add(Boat1);
		vehs.add(Helicopter1);
		vehs.add(Lorry1);

		System.out.println("The vehicles in the garage have " + Boat1.getNoOfWindows() + " , "
				+ Helicopter1.getNoOfWindows() + " and " + Lorry1.getNoOfWindows() + " windows.");
		for (vehicle obj : vehs) {
			System.out.println(obj);

		}

		for (vehicle obj : vehs) {
			System.out.println("The repair cost of the " + obj.getColour() + " vehicle is " + obj.costOfRepair() + ".");
		}

		System.out.println("The total repair cost of the vehicles in the garage is " + (totalBill(vehs) + "."));

		System.out.println("The vehicles have been repaired.");
		clear(vehs);
		if (vehs.size() == 0) {
			System.out.println("The garage is empty.");
		}

	}

	public static int totalBill(List<vehicle> vehs) {
		int bill = 0;
		for (vehicle obj : vehs) {
			bill += obj.costOfRepair();
		}
		return bill;
	}

	public static List<vehicle> clear(List<vehicle> veh) {
		veh.clear();
		return veh;

	}

}
