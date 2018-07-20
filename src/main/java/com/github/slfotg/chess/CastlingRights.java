package com.github.slfotg.chess;

public enum CastlingRights {

    NONE, KING_SIDE, QUEEN_SIDE, BOTH;

    public boolean canCastleKingSide() {
        return this == KING_SIDE || this == BOTH;
    }

    public boolean canCastleQueenSide() {
        return this == QUEEN_SIDE || this == BOTH;
    }

    public static CastlingRights parseWhiteRights(String code) {
        if (code.contains("K")) {
            if (code.contains("Q")) {
                return BOTH;
            } else {
                return KING_SIDE;
            }
        } else if (code.contains("Q")) {
            return QUEEN_SIDE;
        }
        return NONE;
    }

    public static CastlingRights parseBlackRights(String code) {
        if (code.contains("k")) {
            if (code.contains("q")) {
                return BOTH;
            } else {
                return KING_SIDE;
            }
        } else if (code.contains("q")) {
            return QUEEN_SIDE;
        }
        return NONE;
    }

    public static String toString(CastlingRights whiteRights, CastlingRights blackRights) {
        String s = whiteRights.toString(Color.WHITE) + blackRights.toString(Color.BLACK);
        if (s.length() > 0) {
            return s;
        }
        return "-";
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
