package com.mykhailo;

public class Tower extends Unit {

    public Tower(Name name, boolean isBreakable) {
        super(name, isBreakable);
    }

    @Override
    public String toString() {
        return "Tower{" +
                "name=" + getName() +
                ", isBreakable=" + getBreakable() +
                '}';
    }
}
