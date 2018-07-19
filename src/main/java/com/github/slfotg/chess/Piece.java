package com.github.slfotg.chess;

public enum Piece {

    PAWN(1, 'P'), KNIGHT(3, 'N'), BISHOP(3, 'B'), ROOK(5, 'R'), QUEEN(9, 'Q'), KING(0, 'K');

    private char code;
    private int weight;

    Piece(int weight, char code) {
        this.weight = weight;
        this.code = code;
    }

    public static Piece fromCode(char code) {
        switch (Character.toUpperCase(code)) {
        case 'P':
            return PAWN;
        case 'N':
            return KNIGHT;
        case 'B':
            return BISHOP;
        case 'R':
            return ROOK;
        case 'Q':
            return QUEEN;
        case 'K':
            return KING;
        default:
            throw new IllegalArgumentException(String.format("%s is not a valid chess piece", code));
        }
    }

    public int getWeight() {
        return weight;
    }

    public char getCode() {
        return code;
    }

    public String toString() {
        return Character.toString(code);
    }

    public String toString(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        if (color == Color.BLACK) {
            return Character.toString(Character.toLowerCase(code));
        }
        return Character.toString(code);
    }
}
