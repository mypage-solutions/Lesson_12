package com.mykhailo;

public class Soldier extends Movable {

    public Soldier(Name name, int x, int y, boolean isBreakable) {
        super(name, x, y, isBreakable);
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name=" + name +
                ", x=" + x +
                ", y=" + y +
                ", isBreakable=" + isBreakable +
                "} " + super.toString();
    }
}
