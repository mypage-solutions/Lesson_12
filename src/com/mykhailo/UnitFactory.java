package com.mykhailo;

import java.util.ArrayList;

public class UnitFactory {

    private final ArrayList<Unit> listOfUnits = new ArrayList<>();

    private String[][] battlefield;

    public void addUnitsToBattlefield(String[][] matrix, ArrayList<Unit> list) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=". ";
                for (Unit unit : list) {
                    if (unit.getName() == Name.WALL) {
                        matrix[unit.getY()][unit.getX()] = "w ";
                    } else if (unit.getName() == Name.TOWER) {
                        matrix[unit.getY()][unit.getX()] = "t ";
                    } else if (unit.getName() == Name.SOLDIER) {
                        matrix[unit.getY()][unit.getX()] = "S ";
                    } else if (unit.getName() == Name.TANK) {
                        matrix[unit.getY()][unit.getX()] = "T ";
                    }
                }
            }
        }
    }

    public void printMatrix (String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        UnitFactory game = new UnitFactory();
        Wall wall = new Wall(Name.WALL, 5, 4, true);
        Tower tower = new Tower(Name.TOWER, 3, 4, false);
        Soldier soldier = new Soldier(Name.SOLDIER, 8, 9, true);
        Tank tank = new Tank(Name.TANK, 2, 7, true);
        game.listOfUnits.add(wall);
        game.listOfUnits.add(tower);
        game.listOfUnits.add(soldier);
        game.listOfUnits.add(tank);
        System.out.println(game.listOfUnits);
        game.battlefield = new String[10][10];
        game.addUnitsToBattlefield(game.battlefield, game.listOfUnits);
        game.printMatrix(game.battlefield);
        System.out.println();
        System.out.println("Testing Soldier and Tank methods:");
        soldier.move();
        soldier.fire();
        tank.move();
        tank.fire();
        tank.reload();

    }
}
