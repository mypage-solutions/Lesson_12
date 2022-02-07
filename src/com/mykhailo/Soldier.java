package com.mykhailo;

public class Soldier extends Unit {

    protected boolean canMove;
    protected boolean canFire;

    public Soldier(Name name, boolean isBreakable, boolean canMove, boolean canFire) {
        super(name, isBreakable);
        this.canMove = canMove;
        this.canFire = canFire;
    }

    public boolean getMove() {
        return canMove;
    }

    public boolean getFire() {
        return canFire;
    }

    public void move() {
        System.out.println("I can move!");
    }

    public void fire() {
        System.out.println("I can fire!");
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name=" + getName() +
                ", isBreakable=" + getBreakable() +
                ", canMove=" + canMove +
                ", canFire=" + canFire +
                '}';
    }
}
