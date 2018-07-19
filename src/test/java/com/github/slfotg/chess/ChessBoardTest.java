package com.github.slfotg.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ChessBoardTest {

    @Test
    public void testEmptyBoardFen() {
        ChessBoard board = new ChessBoard();
        assertEquals("8/8/8/8/8/8/8/8 w KQkq - 0 0", board.toFenCode());
    }
}
