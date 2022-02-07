package com.mykhailo;

public class Wall extends Unit {

    public Wall(Name name, boolean isBreakable) {
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
