package com.github.slfotg.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ChessBoardTest {

    @Test
    public void testEmptyBoardFen() {
        ChessBoard board = new ChessBoard();
        assertEquals("8/8/8/8/8/8/8/8 w KQkq - 0 0", board.toFenCode());
    }

    @Test
    public void testSetPieceAtIllegalArguments() {
        ChessBoard board = new ChessBoard();
        Position position = Position.fromCode("f7").get();
        assertThrows(IllegalArgumentException.class, () -> board.setPieceAt(null, null));
        assertThrows(IllegalArgumentException.class, () -> board.setPieceAt(null, position));
        assertThrows(IllegalArgumentException.class,
                () -> board.setPieceAt(new ColoredPiece(Color.WHITE, Piece.BISHOP), null));
    }
}
