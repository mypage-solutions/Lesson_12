package com.mykhailo;

import java.util.ArrayList;
import java.util.Random;

public class UnitFactory {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        UnitFactory game = new UnitFactory();
        Wall wall = new Wall(Name.WALL,true);
        Tower tower = new Tower(Name.TOWER, false);
        Soldier soldier = new Soldier(Name.SOLDIER, true,true,true);
        Tank tank = new Tank(Name.TANK,true,true,true,true);
        game.unitList.add(wall);
        game.unitList.add(tower);
        game.unitList.add(soldier);
        game.unitList.add(tank);
        game.matrix = new Unit[10][10];
        game.addUnitsToMatrix(game.matrix);
        game.printUnitInfo(game.matrix);
        System.out.println();
        game.printUnitNames(game.matrix);
        System.out.println();
        soldier.move();
        soldier.fire();
        tank.move();
        tank.fire();
        tank.reload();

    }

    private ArrayList<Unit> unitList = new ArrayList<>();

    private Unit[][] matrix;

    protected void addUnitsToMatrix(Unit[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = unitList.get(RANDOM.nextInt(unitList.size()));
            }
        }
    }

    protected void printUnitInfo(Unit[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    protected void printUnitNames(Unit[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (this.matrix[i][j].getName() == Name.WALL) {
                    System.out.print("Wall     ");
                } else if (this.matrix[i][j].getName() == Name.TOWER) {
                    System.out.print("Tower    ");
                } else if (this.matrix[i][j].getName() == Name.SOLDIER) {
                    System.out.print("Soldier  ");
                } else if (this.matrix[i][j].getName() == Name.TANK) {
                    System.out.print("Tank     ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}
