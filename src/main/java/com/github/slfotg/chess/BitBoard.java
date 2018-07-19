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
        return (bits & positionToBit(position)) != 0;
    }

    public void setPiece(Position position) {
        bits |= positionToBit(position);
    }

    public void removePiece(Position position) {
        bits &= ~positionToBit(position);
    }

    public long getBits() {
        return bits;
    }

    protected static long positionToBit(Position position) {
        return 1L << position.getIndex();
    }
}
