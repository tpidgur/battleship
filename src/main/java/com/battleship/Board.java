package com.battleship;

public class Board {

    private int[][] field = new int[10][10];

    public boolean checkHitStatus(int coordinateX, int coordinateY) {
        return field[coordinateX][coordinateY] != 0;
    }
}
