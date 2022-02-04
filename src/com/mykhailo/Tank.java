package com.mykhailo;

public class Tank extends Soldier {

    protected Tank() {
        super(Name.TANK, true, true, true, true);
    }

    protected void reload() {
        System.out.println(Name.TANK + " says, I can reload!");
    }

    @Override
    protected void move() {
        System.out.println(Name.TANK + " says, I can move!");
    }

    @Override
    protected void fire() {
        System.out.println(Name.TANK + " says, I can fire!");
    }
}
