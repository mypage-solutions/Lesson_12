package com.mykhailo;

public abstract class Unit {

    private Name name;
    private boolean isImmortal;
    private boolean canMove;
    private boolean canFire;
    private boolean canReload;

    protected Unit(Name name, boolean isImmortal, boolean canMove, boolean canFire, boolean canReload) {
        this.name = name;
        this.isImmortal = isImmortal;
        this.canMove = canMove;
        this.canFire = canFire;
        this.canReload = canReload;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name=" + name +
                ", isImmortal=" + isImmortal +
                ", canMove=" + canMove +
                ", canFire=" + canFire +
                ", canReload=" + canReload +
                '}';
    }
}
