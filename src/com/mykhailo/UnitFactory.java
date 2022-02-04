package com.mykhailo;

import java.util.ArrayList;
import java.util.Random;

public class UnitFactory {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        UnitFactory game = new UnitFactory();
        Wall wall = new Wall();
        Tower tower = new Tower();
        Soldier soldier = new Soldier();
        Tank tank = new Tank();
        game.unitList.add(wall);
        game.unitList.add(tower);
        game.unitList.add(soldier);
        game.unitList.add(tank);
        game.unitArray = new Unit[10][10];
        game.addUnitItemsToArray(game.unitArray);
        game.printUnitNames(game.unitArray);
        System.out.println();
        game.printUnitItems(game.unitArray);
        System.out.println();
        soldier.move();
        soldier.fire();
        tank.move();
        tank.fire();
        tank.reload();

    }

    private ArrayList<Unit> unitList = new ArrayList<>();

    private Unit[][] unitArray;

    protected void addUnitItemsToArray(Unit[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = unitList.get(RANDOM.nextInt(unitList.size()));
            }
        }
    }

    protected void printUnitNames(Unit[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    protected void printUnitItems(Unit[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (unitArray[i][j].getName() == Name.WALL) {
                    System.out.print("Wall     ");
                } else if (unitArray[i][j].getName() == Name.TOWER) {
                    System.out.print("Tower    ");
                } else if (unitArray[i][j].getName() == Name.SOLDIER) {
                    System.out.print("Soldier  ");
                } else if (unitArray[i][j].getName() == Name.TANK) {
                    System.out.print("Tank     ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}
