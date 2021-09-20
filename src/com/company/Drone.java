package com.company;

public class Drone extends Sapper{
    public Drone() {
        super(new MoveByWings(), new DetectByWaves(), new DefuseByTentacles());
    }

    @Override
    public void display() {
        System.out.println(" I am a drone Sapper");
    }
}
