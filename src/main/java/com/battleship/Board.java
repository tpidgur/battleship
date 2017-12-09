package com.battleship;

public class Board {

    private int[][] cells = new int[10][10];
    private static final int EMPTY = 0;
    private static final int OCCUPIED = 1;
    private static final int START_POINT_INDEX = 0;
    private static final int END_POINT_INDEX = 1;
    private static final int SINGLE_POINT = 1;

    public boolean isEmptyCell(Point point) {
        return cells[point.getX()][point.getY()] == EMPTY;
    }

    public void placeShip(Point... points) {
        if (points.length == SINGLE_POINT) {
            placeSingleDeckShip(points[START_POINT_INDEX]);
        } else {
            placeMultiDeckShip(points[START_POINT_INDEX], points[END_POINT_INDEX]);
        }
    }

    private void placeSingleDeckShip(Point point) {
        cells[point.getX()][point.getY()] = OCCUPIED;
    }

    private void placeMultiDeckShip(Point startPoint, Point endPoint) {
        for (int x = startPoint.getX(); x <= endPoint.getX(); x++) {
            for (int y = startPoint.getY(); y <= endPoint.getY(); y++) {
                cells[x][y] = OCCUPIED;
            }
        }
    }
}
