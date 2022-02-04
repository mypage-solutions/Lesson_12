package com.mykhailo;

public abstract class Unit {

    private Name name;
    private boolean isBreakable;

    protected Unit(Name name, boolean isBreakable) {
        this.name = name;
        this.isBreakable = isBreakable;
    }

    protected Name getName() {
        return name;
    }

    protected boolean getBreakable() {
        return isBreakable;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name=" + name +
                ", isBreakable=" + isBreakable +
                '}';
    }
}
