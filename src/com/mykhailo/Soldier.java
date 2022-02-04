package com.mykhailo;

public class Soldier extends Unit {

    protected Soldier(Name name, boolean isImmortal, boolean canMove, boolean canFire, boolean canReload) {
        super(name, isImmortal, canMove, canFire, canReload);
    }

    protected Soldier() {
        super(Name.SOLDIER, true, true, true, false);
    }

    protected void move() {
        System.out.println(Name.SOLDIER + " says, I can move!");
    }

    protected void fire() {
        System.out.println(Name.SOLDIER + " says, I can fire!");
    }
}
