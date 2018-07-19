package com.github.slfotg.chess;

public class BitBoard {

    private long bits;

    public BitBoard(long bits) {
        this.bits = bits;
    }

    public boolean hasPieceAt(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("Position cannot be null");
        }
        return (bits & 1L << position.getIndex()) != 0;
    }
}
