package com.github.slfotg.chess;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ChessBoardTest {

    @Test
    void testSetPieceAtIllegalArguments() {
        ChessBoard board = ChessBoard.emptyBoard();
        Position position = Position.fromCode("f7").get();
        assertThrows(IllegalArgumentException.class, () -> board.setPieceAt(null, null));
        assertThrows(IllegalArgumentException.class, () -> board.setPieceAt(null, position));
        assertThrows(IllegalArgumentException.class,
                () -> board.setPieceAt(ColoredPiece.WHITE_BISHOP, null));
    }
}
