package com.company;

public class Human extends Sapper{
    public Human() {
        super(new MoveByFeet(), new DetectByEyes(), new DefuseByHands());
    }

    @Override
    public void display() {
        System.out.println("I am a human sapper");
    }
}
