package com.github.slfotg.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PieceTest {

    @Test
    void testCodes() {
        assertEquals('P', Piece.PAWN.getCode());
        assertEquals('N', Piece.KNIGHT.getCode());
        assertEquals('B', Piece.BISHOP.getCode());
        assertEquals('R', Piece.ROOK.getCode());
        assertEquals('Q', Piece.QUEEN.getCode());
        assertEquals('K', Piece.KING.getCode());
    }

    @Test
    void testFromCode() {
        assertEquals(Piece.PAWN, Piece.fromCode('P'));
        assertEquals(Piece.KNIGHT, Piece.fromCode('N'));
        assertEquals(Piece.BISHOP, Piece.fromCode('B'));
        assertEquals(Piece.ROOK, Piece.fromCode('R'));
        assertEquals(Piece.QUEEN, Piece.fromCode('Q'));
        assertEquals(Piece.KING, Piece.fromCode('K'));

        assertEquals(Piece.PAWN, Piece.fromCode('p'));
        assertEquals(Piece.KNIGHT, Piece.fromCode('n'));
        assertEquals(Piece.BISHOP, Piece.fromCode('b'));
        assertEquals(Piece.ROOK, Piece.fromCode('r'));
        assertEquals(Piece.QUEEN, Piece.fromCode('q'));
        assertEquals(Piece.KING, Piece.fromCode('k'));

        assertThrows(IllegalArgumentException.class, () -> Piece.fromCode('*'));
    }

    @Test
    void testWeights() {
        assertEquals(1, Piece.PAWN.getWeight());
        assertEquals(3, Piece.KNIGHT.getWeight());
        assertEquals(3, Piece.BISHOP.getWeight());
        assertEquals(5, Piece.ROOK.getWeight());
        assertEquals(9, Piece.QUEEN.getWeight());
        assertEquals(0, Piece.KING.getWeight());
    }

    @Test
    void testBlackToString() {
        assertEquals("p", Piece.PAWN.toString(Color.BLACK));
        assertEquals("n", Piece.KNIGHT.toString(Color.BLACK));
        assertEquals("b", Piece.BISHOP.toString(Color.BLACK));
        assertEquals("r", Piece.ROOK.toString(Color.BLACK));
        assertEquals("q", Piece.QUEEN.toString(Color.BLACK));
        assertEquals("k", Piece.KING.toString(Color.BLACK));
    }

    @Test
    void testWhiteToString() {
        assertEquals("P", Piece.PAWN.toString(Color.WHITE));
        assertEquals("N", Piece.KNIGHT.toString(Color.WHITE));
        assertEquals("B", Piece.BISHOP.toString(Color.WHITE));
        assertEquals("R", Piece.ROOK.toString(Color.WHITE));
        assertEquals("Q", Piece.QUEEN.toString(Color.WHITE));
        assertEquals("K", Piece.KING.toString(Color.WHITE));
    }

    @Test
    void testNullColor() {
        assertThrows(IllegalArgumentException.class, () -> Piece.KING.toString(null));
    }

    @Test
    void testToString() {
        assertEquals("P", Piece.PAWN.toString());
        assertEquals("N", Piece.KNIGHT.toString());
        assertEquals("B", Piece.BISHOP.toString());
        assertEquals("R", Piece.ROOK.toString());
        assertEquals("Q", Piece.QUEEN.toString());
        assertEquals("K", Piece.KING.toString());
    }
}
