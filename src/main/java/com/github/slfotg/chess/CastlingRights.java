package com.github.slfotg.chess;

public enum CastlingRights {

    NONE, KING_SIDE, QUEEN_SIDE, BOTH;

    public boolean canCastleKingSide() {
        return this == KING_SIDE || this == BOTH;
    }

    public boolean canCastleQueenSide() {
        return this == KING_SIDE || this == BOTH;
    }

    public String toString(Color color) {
        String castleRights = "";
        switch (this) {
        case KING_SIDE:
            castleRights = "K";
            break;
        case QUEEN_SIDE:
            castleRights = "Q";
            break;
        case BOTH:
            castleRights = "KQ";
        default:
        }
        if (color == Color.BLACK) {
            castleRights = castleRights.toLowerCase();
        }
        return castleRights;
    }
}
