package com.github.slfotg.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BitBoardTest {

    @Test
    public void testHasPieceAt() {
        BitBoard bitBoard = new BitBoard(3L);
        assertTrue(bitBoard.hasPieceAt(new Position(Rank.ONE, File.A)));
        assertTrue(bitBoard.hasPieceAt(new Position(Rank.ONE, File.B)));
    }

    @Test
    public void testPositionToBit() {
        long expected = 1L;
        for (int i = 0; i < Rank.ORDERED_RANKS.length; i += 1) {
            for (int j = 0; j < File.ORDERED_FILES.length; j += 1) {
                assertEquals(expected,
                        BitBoard.positionToBit(new Position(Rank.ORDERED_RANKS[i], File.ORDERED_FILES[j])));
                expected *= 2L;
            }
        }
    }

    @Test
    public void testSetPiece() {
        BitBoard bitBoard = new BitBoard(0L);
        bitBoard.setPiece(new Position(Rank.SEVEN, File.D));
        assertEquals(2251799813685248L, bitBoard.getBits());
    }

    @Test
    public void testRemovePiece() {
        BitBoard bitBoard = new BitBoard(2251799813685251L);
        bitBoard.removePiece(new Position(Rank.SEVEN, File.D));
        assertEquals(3L, bitBoard.getBits());
    }
}
