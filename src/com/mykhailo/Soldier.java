package com.mykhailo;

public class Soldier extends Unit {

    private boolean canMove;
    private boolean canFire;

    protected Soldier(Name name, boolean isBreakable, boolean canMove, boolean canFire) {
        super(name, isBreakable);
        this.canMove = canMove;
        this.canFire = canFire;
    }

    protected boolean getMove() {
        return canMove;
    }

    protected boolean getFire() {
        return canFire;
    }

    protected void move() {
        System.out.println("I can move!");
    }

    protected void fire() {
        System.out.println("I can fire!");
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name=" + getName() +
                ", isBreakable=" + getBreakable() +
                ", canMove=" + canMove +
                ", canFire=" + canFire +
                '}';
    }
}
