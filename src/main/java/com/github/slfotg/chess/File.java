package com.github.slfotg.chess;

public enum File {

    A('a', 0), B('b', 1), C('c', 2), D('d', 3), E('e', 4), F('f', 5), G('g', 6), H('h', 7);

    static final File[] FEN_ORDERED_FILES = new File[] { A, B, C, D, E, F, G, H };
    static final File[] ORDERED_FILES = new File[] { A, B, C, D, E, F, G, H };

    private char code;
    private int index;

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

    public String toString() {
        return Character.toString(code);
    }
}
