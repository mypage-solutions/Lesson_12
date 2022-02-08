package com.mykhailo;

public class Tower extends Unit {

    public Tower(Name name, int x, int y, boolean isBreakable) {
        super(name, x, y, isBreakable);
    }

    @Override
    public String toString() {
        return "Tower{" +
                "name=" + name +
                ", x=" + x +
                ", y=" + y +
                ", isBreakable=" + isBreakable +
                "} " + super.toString();
    }
}
