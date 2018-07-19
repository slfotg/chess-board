package com.github.slfotg.chess;

public enum Color {

    WHITE('w'), BLACK('b');

    private char code;

    Color(char code) {
        this.code = code;
    }

    public char getCode() {
        return code;
    }

    public Color getNextColor() {
        if (this == WHITE) {
            return BLACK;
        }
        return WHITE;
    }

    @Override
    public String toString() {
        return Character.toString(code);
    }

    public static Color fromCode(char code) {
        switch (code) {
        case 'w':
            return WHITE;
        case 'b':
            return BLACK;
        default:
            throw new IllegalArgumentException(String.format("%s is not a valid color code", code));
        }
    }
}
