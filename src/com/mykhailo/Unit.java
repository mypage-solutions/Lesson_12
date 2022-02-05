package com.mykhailo;

public abstract class Unit {

    private final Name name;
    private final boolean isBreakable;

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
}
