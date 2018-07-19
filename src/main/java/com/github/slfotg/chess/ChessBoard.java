package com.github.slfotg.chess;

import java.util.Optional;

public class ChessBoard {

    private BitBoard whitePawns;
    private BitBoard whiteKnights;
    private BitBoard whiteBishops;
    private BitBoard whiteRooks;
    private BitBoard whiteQueens;
    private BitBoard whiteKings;

    private BitBoard blackPawns;
    private BitBoard blackKnights;
    private BitBoard blackBishops;
    private BitBoard blackRooks;
    private BitBoard blackQueens;
    private BitBoard blackKings;
    
    private Color activeColor;
    private Optional<Position> enPassant;
    private CastlingRights whiteCastlingRights;
    private CastlingRights blackCastlingRights;
    private int fullMoveNumber;
    private int halfMoveClock;
    
    public Optional<ColoredPiece> getPieceAt(Position position) {
        if (whitePawns.hasPieceAt(position)) {
            return Optional.of(new ColoredPiece(Color.WHITE, Piece.PAWN));
        }
        if (whiteKnights.hasPieceAt(position)) {
            return Optional.of(new ColoredPiece(Color.WHITE, Piece.KNIGHT));
        }
        if (whiteBishops.hasPieceAt(position)) {
            return Optional.of(new ColoredPiece(Color.WHITE, Piece.BISHOP));
        }
        if (whiteRooks.hasPieceAt(position)) {
            return Optional.of(new ColoredPiece(Color.WHITE, Piece.ROOK));
        }
        if (whiteQueens.hasPieceAt(position)) {
            return Optional.of(new ColoredPiece(Color.WHITE, Piece.QUEEN));
        }
        if (whiteKings.hasPieceAt(position)) {
            return Optional.of(new ColoredPiece(Color.WHITE, Piece.KING));
        }
        if (blackPawns.hasPieceAt(position)) {
            return Optional.of(new ColoredPiece(Color.BLACK, Piece.PAWN));
        }
        if (blackKnights.hasPieceAt(position)) {
            return Optional.of(new ColoredPiece(Color.BLACK, Piece.KNIGHT));
        }
        if (blackBishops.hasPieceAt(position)) {
            return Optional.of(new ColoredPiece(Color.BLACK, Piece.BISHOP));
        }
        if (blackRooks.hasPieceAt(position)) {
            return Optional.of(new ColoredPiece(Color.BLACK, Piece.ROOK));
        }
        if (blackQueens.hasPieceAt(position)) {
            return Optional.of(new ColoredPiece(Color.BLACK, Piece.QUEEN));
        }
        if (blackKings.hasPieceAt(position)) {
            return Optional.of(new ColoredPiece(Color.BLACK, Piece.KING));
        }
        return Optional.empty();
    }
}
