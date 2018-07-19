package com.github.slfotg.chess;

public enum CastlingRights {

    NONE, KING_SIDE, QUEEN_SIDE, BOTH;
    
    public boolean canCastleKingSide() {
        return this == KING_SIDE || this == BOTH;
    }
    
    public boolean canCastleQueenSide() {
        return this == KING_SIDE || this == BOTH;
    }
}
