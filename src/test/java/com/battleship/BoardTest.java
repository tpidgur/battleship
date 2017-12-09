package com.battleship;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class BoardTest {

    private Board board;
    private static final Point A = new Point(1, 1);
    private static final Point B = new Point(1, 2);
    private static final Point C = new Point(1, 3);
    private static final Point D = new Point(1, 4);
    private static final Point E = new Point(2, 1);
    private static final Point F = new Point(3, 1);
    private static final Point G = new Point(4, 1);

    @Before
    public void setup() {
        board = new Board();
    }

    @Test
    public void shouldCheckCellStatus() {
        assertTrue(board.isEmptyCell(new Point(1, 1)));
    }

    @Test
    public void shouldPlaceOneDeckShip() {
        board.placeShip(A);
        assertFalse(board.isEmptyCell(A));
    }

    @Test
    public void shouldPlaceFourDeckShipVertically() {
        board.placeShip(A, D);
        assertFalse(board.isEmptyCell(A));
        assertFalse(board.isEmptyCell(B));
        assertFalse(board.isEmptyCell(C));
        assertFalse(board.isEmptyCell(D));
    }

    @Test
    public void shouldPlaceFourDeckShipHorizontally() {
        board.placeShip(A, G);
        assertFalse(board.isEmptyCell(A));
        assertFalse(board.isEmptyCell(E));
        assertFalse(board.isEmptyCell(F));
        assertFalse(board.isEmptyCell(G));
    }
}