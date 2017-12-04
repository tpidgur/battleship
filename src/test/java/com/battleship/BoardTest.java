package com.battleship;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    private Board board = new Board();

    @Test
    public void shouldMissContender() {
        boolean hitStatus = board.checkHitStatus(1, 1);
        assertTrue(hitStatus == false);
    }
}