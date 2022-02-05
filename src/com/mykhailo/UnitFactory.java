package com.mykhailo;

import java.util.ArrayList;
import java.util.Random;

public class UnitFactory {

    private static final Random RANDOM = new Random();

    private final ArrayList<Unit> listOfUnits = new ArrayList<>();

    private Unit[][] battlefield;

    protected void addUnitsToBattlefield(Unit[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = listOfUnits.get(RANDOM.nextInt(listOfUnits.size()));
            }
        }
    }

    protected void printUnitNamesOnBattlefield(Unit[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (this.battlefield[i][j].getName() == Name.WALL) {
                    System.out.print("Wall     ");
                } else if (this.battlefield[i][j].getName() == Name.TOWER) {
                    System.out.print("Tower    ");
                } else if (this.battlefield[i][j].getName() == Name.SOLDIER) {
                    System.out.print("Soldier  ");
                } else if (this.battlefield[i][j].getName() == Name.TANK) {
                    System.out.print("Tank     ");
                }
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {

        UnitFactory game = new UnitFactory();
        Wall wall = new Wall(Name.WALL, true);
        Tower tower = new Tower(Name.TOWER, false);
        Soldier soldier = new Soldier(Name.SOLDIER, true, true, true);
        Tank tank = new Tank(Name.TANK, true, true, true, true);
        game.listOfUnits.add(wall);
        game.listOfUnits.add(tower);
        game.listOfUnits.add(soldier);
        game.listOfUnits.add(tank);
        System.out.println(game.listOfUnits);
        game.battlefield = new Unit[10][10];
        game.addUnitsToBattlefield(game.battlefield);
        System.out.println();
        game.printUnitNamesOnBattlefield(game.battlefield);
        System.out.println("Testing Soldier and Tank methods:");
        soldier.move();
        soldier.fire();
        tank.move();
        tank.fire();
        tank.reload();

    }
}
