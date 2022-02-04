package com.mykhailo;

public class Tank extends Soldier {

    private boolean canReload;

    protected Tank(Name name, boolean isBreakable, boolean canMove, boolean canFire, boolean canReload) {
        super(name, isBreakable, canMove, canFire);
        this.canReload = canReload;
    }

    protected void reload() {
        System.out.println("I can reload!");
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name=" + getName() +
                ", isBreakable=" + getBreakable() +
                ", canMove=" + getMove() +
                ", canFire=" + getFire() +
                ", canReload=" + canReload +
                '}';
    }
}
