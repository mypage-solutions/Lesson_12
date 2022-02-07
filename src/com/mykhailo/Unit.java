package com.mykhailo;

public abstract class Unit {

    protected Name name;
    protected boolean isBreakable;

    public Unit(Name name, boolean isBreakable) {
        this.name = name;
        this.isBreakable = isBreakable;
    }

    public Name getName() {
        return name;
    }

    public boolean getBreakable() {
        return isBreakable;
    }
}
