package com.github.slfotg.chess;

public enum File {

    A('a', 0), B('b', 1), C('c', 2), D('d', 3), E('e', 4), F('f', 5), G('g', 6), H('h', 7);

    public static final File[] FEN_ORDERED_FILES = new File[] { A, B, C, D, E, F, G, H };
    public static final File[] ORDERED_FILES = new File[] { A, B, C, D, E, F, G, H };

    private final char code;
    private final int index;

    File(char code, int index) {
        this.code = code;
        this.index = index;
    }

    public char getCode() {
        return code;
    }

    public int getIndex() {
        return index;
    }

    public static File fromCode(char code) {
        switch (code) {
        case 'a':
            return A;
        case 'b':
            return B;
        case 'c':
            return C;
        case 'd':
            return D;
        case 'e':
            return E;
        case 'f':
            return F;
        case 'g':
            return G;
        case 'h':
            return H;
        default:
            throw new IllegalArgumentException(String.format("Code %s cannot be converted to a File", code));
        }
    }

    @Override
    public String toString() {
        return Character.toString(code);
    }
}
