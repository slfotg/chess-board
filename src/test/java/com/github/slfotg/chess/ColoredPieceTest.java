package com.github.slfotg.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ColoredPieceTest {

    @Test
    void testNullParamsInConstructor() {
        assertThrows(IllegalArgumentException.class, () -> ColoredPiece.fromColorAndPiece(null, null));
        assertThrows(IllegalArgumentException.class, () -> ColoredPiece.fromColorAndPiece(Color.WHITE, null));
        assertThrows(IllegalArgumentException.class, () -> ColoredPiece.fromColorAndPiece(null, Piece.ROOK));
    }

    @Test
    void testGetFenCode() {
        assertEquals("P", ColoredPiece.fromColorAndPiece(Color.WHITE, Piece.PAWN).getFenCode());
        assertEquals("N", ColoredPiece.fromColorAndPiece(Color.WHITE, Piece.KNIGHT).getFenCode());
        assertEquals("B", ColoredPiece.fromColorAndPiece(Color.WHITE, Piece.BISHOP).getFenCode());
        assertEquals("R", ColoredPiece.fromColorAndPiece(Color.WHITE, Piece.ROOK).getFenCode());
        assertEquals("Q", ColoredPiece.fromColorAndPiece(Color.WHITE, Piece.QUEEN).getFenCode());
        assertEquals("K", ColoredPiece.fromColorAndPiece(Color.WHITE, Piece.KING).getFenCode());

        assertEquals("p", ColoredPiece.fromColorAndPiece(Color.BLACK, Piece.PAWN).getFenCode());
        assertEquals("n", ColoredPiece.fromColorAndPiece(Color.BLACK, Piece.KNIGHT).getFenCode());
        assertEquals("b", ColoredPiece.fromColorAndPiece(Color.BLACK, Piece.BISHOP).getFenCode());
        assertEquals("r", ColoredPiece.fromColorAndPiece(Color.BLACK, Piece.ROOK).getFenCode());
        assertEquals("q", ColoredPiece.fromColorAndPiece(Color.BLACK, Piece.QUEEN).getFenCode());
        assertEquals("k", ColoredPiece.fromColorAndPiece(Color.BLACK, Piece.KING).getFenCode());
    }

    @Test
    void testFromFenCode() {
        assertEquals(Color.WHITE, ColoredPiece.fromFenCode('P').getColor());
        assertEquals(Piece.PAWN, ColoredPiece.fromFenCode('P').getPiece());

        assertEquals(Color.WHITE, ColoredPiece.fromFenCode('N').getColor());
        assertEquals(Piece.KNIGHT, ColoredPiece.fromFenCode('N').getPiece());

        assertEquals(Color.WHITE, ColoredPiece.fromFenCode('B').getColor());
        assertEquals(Piece.BISHOP, ColoredPiece.fromFenCode('B').getPiece());

        assertEquals(Color.WHITE, ColoredPiece.fromFenCode('R').getColor());
        assertEquals(Piece.ROOK, ColoredPiece.fromFenCode('R').getPiece());

        assertEquals(Color.WHITE, ColoredPiece.fromFenCode('Q').getColor());
        assertEquals(Piece.QUEEN, ColoredPiece.fromFenCode('Q').getPiece());

        assertEquals(Color.WHITE, ColoredPiece.fromFenCode('K').getColor());
        assertEquals(Piece.KING, ColoredPiece.fromFenCode('K').getPiece());

        assertEquals(Color.BLACK, ColoredPiece.fromFenCode('p').getColor());
        assertEquals(Piece.PAWN, ColoredPiece.fromFenCode('p').getPiece());

        assertEquals(Color.BLACK, ColoredPiece.fromFenCode('n').getColor());
        assertEquals(Piece.KNIGHT, ColoredPiece.fromFenCode('n').getPiece());

        assertEquals(Color.BLACK, ColoredPiece.fromFenCode('b').getColor());
        assertEquals(Piece.BISHOP, ColoredPiece.fromFenCode('b').getPiece());

        assertEquals(Color.BLACK, ColoredPiece.fromFenCode('r').getColor());
        assertEquals(Piece.ROOK, ColoredPiece.fromFenCode('r').getPiece());

        assertEquals(Color.BLACK, ColoredPiece.fromFenCode('q').getColor());
        assertEquals(Piece.QUEEN, ColoredPiece.fromFenCode('q').getPiece());

        assertEquals(Color.BLACK, ColoredPiece.fromFenCode('k').getColor());
        assertEquals(Piece.KING, ColoredPiece.fromFenCode('k').getPiece());
    }
}
