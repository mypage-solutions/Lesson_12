package com.mykhailo;

public abstract class Movable extends Unit {

    public Movable(Name name, int x, int y, boolean isBreakable) {
        super(name, x, y, isBreakable);
    }

    public void move() {
        this.x += 1;
        this.y += 1;
    }

    public void fire() {
        System.out.println("Fire!");
    }
}
