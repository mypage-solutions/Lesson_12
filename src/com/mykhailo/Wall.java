package com.mykhailo;

public class Wall extends Unit {

    public Wall(Name name, int x, int y, boolean isBreakable) {
        super(name, x, y, isBreakable);
    }

    @Override
    public String toString() {
        return "Wall{" +
                "name=" + name +
                ", x=" + x +
                ", y=" + y +
                ", isBreakable=" + isBreakable +
                "} ";
    }
}
