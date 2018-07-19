package com.github.slfotg.chess;

public class ColoredPiece {

    private Color color;
    private Piece piece;

    private ColoredPiece() {

    }

    public ColoredPiece(Color color, Piece piece) {
        if (color == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        if (piece == null) {
            throw new IllegalArgumentException("Piece cannot be null");
        }
        this.color = color;
        this.piece = piece;
    }

    public Color getColor() {
        return color;
    }

    public Piece getPiece() {
        return piece;
    }

    public String getFenCode() {
        return piece.toString(color);
    }

    public static ColoredPiece fromFenCode(char code) {
        ColoredPiece piece = new ColoredPiece();
        piece.piece = Piece.fromCode(code);
        piece.color = Character.isUpperCase(code) ? Color.WHITE : Color.BLACK;
        return piece;
    }
}
