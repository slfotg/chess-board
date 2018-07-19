package com.github.slfotg.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ColoredPieceTest {

    @Test
    public void testNullParamsInConstructor() {
        assertThrows(IllegalArgumentException.class, () -> new ColoredPiece(null, null));
        assertThrows(IllegalArgumentException.class, () -> new ColoredPiece(Color.WHITE, null));
        assertThrows(IllegalArgumentException.class, () -> new ColoredPiece(null, Piece.ROOK));
    }

    @Test
    public void testGetFenCode() {
        assertEquals("P", new ColoredPiece(Color.WHITE, Piece.PAWN).getFenCode());
        assertEquals("N", new ColoredPiece(Color.WHITE, Piece.KNIGHT).getFenCode());
        assertEquals("B", new ColoredPiece(Color.WHITE, Piece.BISHOP).getFenCode());
        assertEquals("R", new ColoredPiece(Color.WHITE, Piece.ROOK).getFenCode());
        assertEquals("Q", new ColoredPiece(Color.WHITE, Piece.QUEEN).getFenCode());
        assertEquals("K", new ColoredPiece(Color.WHITE, Piece.KING).getFenCode());

        assertEquals("p", new ColoredPiece(Color.BLACK, Piece.PAWN).getFenCode());
        assertEquals("n", new ColoredPiece(Color.BLACK, Piece.KNIGHT).getFenCode());
        assertEquals("b", new ColoredPiece(Color.BLACK, Piece.BISHOP).getFenCode());
        assertEquals("r", new ColoredPiece(Color.BLACK, Piece.ROOK).getFenCode());
        assertEquals("q", new ColoredPiece(Color.BLACK, Piece.QUEEN).getFenCode());
        assertEquals("k", new ColoredPiece(Color.BLACK, Piece.KING).getFenCode());
    }

    @Test
    public void testFromFenCode() {
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
