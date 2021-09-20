package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sapper drone = new Drone();
        drone.display();
        drone.performDefuse();
        drone.performDetect();
        drone.performMove();

    }
}
