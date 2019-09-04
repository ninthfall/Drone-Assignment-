
//Author Name: Xue Ying Ou
//Date: 8/28/2019
//Program Name: Ou_Drone
//Purpose: Simulation using button, drone movement in x,y,z location


import java.util.Scanner;

public class Ou_Drone {

	int droneLocationX;
	int droneLocationY;
	int droneLocationZ;
	String droneOrientation;

	//Creates drone object with orientation and coordinates set to [0,0,0] 
	public Ou_Drone(String orientation){
		droneLocationX = 0;
		droneLocationY = 0;
		droneLocationZ = 0;
		droneOrientation = orientation; 
		System.out.println("Drone starting position set to [0, 0, 0]. Orientation is " 
		+ droneOrientation + ".");
	}

	//Move drone up 1 unit 
	public void moveDroneUp() {
		droneLocationZ += 1;
		System.out.println("Drone moved up.");
	}

	//Move drone down 1 unit
	public void moveDroneDown() {
		droneLocationZ -= 1;
		System.out.println("Drone moved down.");
	}

	//Move drone forward 1 unit (x and y depends on orientation)
	public void moveDroneForward() {
		if (droneOrientation == "North"){
			droneLocationY += 1;
		} else if (droneOrientation == "East"){
			droneLocationX +=1;
		} else if (droneOrientation == "South"){
			droneLocationY -= 1;
		} else if (droneOrientation == "West"){
			droneLocationX -=1;
		}
		System.out.println("Drone moved forward.");
	}

	//Move drone backward 1 unit (x and y depends on orientation)
	public void moveDroneBackward() {
		if (droneOrientation == "North"){
			droneLocationY -= 1;
		} else if (droneOrientation == "East"){
			droneLocationX -=1;
		} else if (droneOrientation == "South"){
			droneLocationY += 1;
		} else if (droneOrientation == "West"){
			droneLocationX +=1;
		}
		System.out.println("Drone moved backward.");
	}
	
	//Turn drone left
	public void turnLeft(){
		if(droneOrientation == "North"){
			droneOrientation = "West";
		} else if (droneOrientation == "West"){
			droneOrientation = "South";
		} else if (droneOrientation == "South"){
			droneOrientation = "East";
		} else if (droneOrientation == "East"){
			droneOrientation = "North";
		}
		System.out.println("Drone turned left.");
	}
	
	//Turn drone right 
	public void turnRight(){
		if(droneOrientation == "North"){
			droneOrientation = "East";
		} else if (droneOrientation == "East"){
			droneOrientation = "South";
		} else if (droneOrientation == "South"){
			droneOrientation = "West";
		} else if (droneOrientation == "West"){
			droneOrientation = "North";
		}
		System.out.println("Drone turned right.");
	}
	
	//Show [x,y,z] coordinates and NESW
	public void displayDronePosition(){
		System.out.println("Drone [x_pos="+ droneLocationX +
				", y_pos=" + droneLocationY + " ,z_pos=" + 
				droneLocationZ + "]. Orientation is " + droneOrientation);
	}

	//Selection menu for drone controls 
	public void droneMenu() {
		System.out.println("Which direction would you like to move drone?");
		System.out.println("1 - Move Up");
		System.out.println("2 - Move Down");
		System.out.println("3 - Move Forward");
		System.out.println("4 - Move Backward");
		System.out.println("5 - Turn Left");
		System.out.println("6 - Turn Right");
		System.out.println("7 - Display Position");
		System.out.println("8 - Exit Navigation");
	}

	public static void main(String[] args) {
		Ou_Drone drone1 = new Ou_Drone("North");

		int choice; 
		Scanner input = new Scanner(System.in);

		do {
			drone1.droneMenu();
			choice = input.nextInt();

			if (choice == 1) {
				drone1.moveDroneUp();
			} else if (choice == 2) {
				drone1.moveDroneDown();
			} else if (choice == 3) {
				drone1.moveDroneForward();
			} else if (choice == 4) {
				drone1.moveDroneBackward();
			} else if (choice == 5) {
				drone1.turnLeft();
			} else if (choice == 6) {
				drone1.turnRight();
			} else if (choice == 7) {
				drone1.displayDronePosition();
			}
		} while (choice != 8); 
		
		input.close();
	}

}
