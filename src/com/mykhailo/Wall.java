package com.mykhailo;

public class Wall extends Unit {

    protected Wall(Name name, boolean isBreakable) {
        super(name, isBreakable);
    }

    @Override
    public String toString() {
        return "Wall{" +
                "name=" + getName() +
                ", isBreakable=" + getBreakable() +
                '}';
    }
}
