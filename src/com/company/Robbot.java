package com.company;

public class Robbot extends Sapper {

    public Robbot() {
        super(new MoveByWheels(), new DetectBySignals(), new DefuseByTentacles());
    }

    @Override
    public void display() {
        System.out.println("I am a robbot sapper");
    }
}
