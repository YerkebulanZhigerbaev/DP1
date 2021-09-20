package com.company;

public class MoveByFeet implements MoveBehavior{
    @Override
    public void move() {
        System.out.println("I move using feet");
    }
}
