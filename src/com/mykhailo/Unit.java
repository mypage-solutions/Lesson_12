package com.mykhailo;

public abstract class Unit {

    protected Name name;
    protected int x;
    protected int y;
    protected boolean isBreakable;

    public Unit(Name name, int x, int y, boolean isBreakable) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.isBreakable = isBreakable;
    }

    public Name getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getBreakable() {
        return isBreakable;
    }
}
