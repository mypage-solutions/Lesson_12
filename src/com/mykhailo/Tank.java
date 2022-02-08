package com.mykhailo;

public class Tank extends Movable {

    public Tank(Name name, int x, int y, boolean isBreakable) {
        super(name, x, y, isBreakable);
    }

    public void reload() {
        System.out.println("Reload!");
    }

    @Override
    public String toString() {
        return "Tank{" +
                "name=" + name +
                ", x=" + x +
                ", y=" + y +
                ", isBreakable=" + isBreakable +
                "} ";
    }
}
