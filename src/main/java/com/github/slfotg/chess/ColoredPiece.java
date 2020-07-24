package com.github.slfotg.chess;

import lombok.Getter;
import lombok.NonNull;

@Getter
public enum ColoredPiece {

    WHITE_PAWN(Color.WHITE, Piece.PAWN, '♙'),
    WHITE_KNIGHT(Color.WHITE, Piece.KNIGHT, '♘'),
    WHITE_BISHOP(Color.WHITE, Piece.BISHOP, '♗'),
    WHITE_ROOK(Color.WHITE, Piece.ROOK, '♖'),
    WHITE_QUEEN(Color.WHITE, Piece.QUEEN, '♕'),
    WHITE_KING(Color.WHITE, Piece.KING, '♔'),

    BLACK_PAWN(Color.BLACK, Piece.PAWN, '♟'),
    BLACK_KNIGHT(Color.BLACK, Piece.KNIGHT, '♞'),
    BLACK_BISHOP(Color.BLACK, Piece.BISHOP, '♝'),
    BLACK_ROOK(Color.BLACK, Piece.ROOK, '♜'),
    BLACK_QUEEN(Color.BLACK, Piece.QUEEN, '♛'),
    BLACK_KING(Color.BLACK, Piece.KING, '♚');

    private final Color color;
    private final Piece piece;
    private final char charRepresentation;

    ColoredPiece(Color color, Piece piece, char charRepresentation) {
        this.color = color;
        this.piece = piece;
        this.charRepresentation = charRepresentation;
    }

    public static ColoredPiece fromColorAndPiece(@NonNull Color color, @NonNull Piece piece) {
        return ColoredPiece.valueOf(color.name() + "_" + piece.name());
    }

    // TODO - move to FEN parser
    public String getFenCode() {
        return piece.toString(color);
    }

    // TODO - move to FEN parser
    public static ColoredPiece fromFenCode(char code) {
        return ColoredPiece.fromColorAndPiece(Character.isUpperCase(code) ? Color.WHITE : Color.BLACK,
                Piece.fromCode(code));
    }
}
