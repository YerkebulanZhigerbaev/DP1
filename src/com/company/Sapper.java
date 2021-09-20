package com.company;

public abstract class Sapper {
    private MoveBehavior moveBehavior;
    private DetectBehaviour detectBehaviour;
    private DefusionBehaviour defusionBehaviour;

    public Sapper(MoveBehavior moveBehavior, DetectBehaviour detectBehaviour, DefusionBehaviour defusionBehaviour) {
        this.moveBehavior = moveBehavior;
        this.detectBehaviour = detectBehaviour;
        this.defusionBehaviour = defusionBehaviour;
    }

    public void performMove(){
        this.moveBehavior.move();
    }
    public void performDefuse(){
        this.defusionBehaviour.defusion();
    }
    public void performDetect(){
        this.detectBehaviour.detect();
    }

    public abstract void display();


    public MoveBehavior getMoveBehavior() {
        return moveBehavior;
    }

    public DetectBehaviour getDetectBehaviour() {
        return detectBehaviour;
    }

    public DefusionBehaviour getDefusionBehaviour() {
        return defusionBehaviour;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void setDetectBehaviour(DetectBehaviour detectBehaviour) {
        this.detectBehaviour = detectBehaviour;
    }

    public void setDefusionBehaviour(DefusionBehaviour defusionBehaviour) {
        this.defusionBehaviour = defusionBehaviour;
    }
}
