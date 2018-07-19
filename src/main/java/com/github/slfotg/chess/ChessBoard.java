package com.github.slfotg.chess;

import java.util.Optional;
import java.util.StringJoiner;

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

    public String toFenCode() {
        StringJoiner fenJoiner = new StringJoiner(" ");
        StringJoiner pieceJoiner = new StringJoiner("/");
        for (int i = 0; i < Rank.FEN_ORDERED_RANKS.length; i += 1) {
            int skips = 0;
            StringBuilder rankBuilder = new StringBuilder();
            for (int j = 0; j < File.FEN_ORDERED_FILES.length; j += 1) {
                Optional<ColoredPiece> piece = getPieceAt(
                        new Position(Rank.FEN_ORDERED_RANKS[i], File.FEN_ORDERED_FILES[j]));
                if (piece.isPresent()) {
                    if (skips > 0) {
                        rankBuilder.append(Integer.toString(skips));
                    }
                    skips = 0;
                    rankBuilder.append(piece.get().toString());
                } else {
                    skips += 1;
                }
            }
            if (skips > 0) {
                rankBuilder.append(Integer.toString(skips));
            }
            pieceJoiner.add(rankBuilder.toString());
        }
        fenJoiner.add(activeColor.toString());
        fenJoiner.add(whiteCastlingRights.toString(Color.WHITE));
        fenJoiner.add(blackCastlingRights.toString(Color.BLACK));
        fenJoiner.add(enPassant.isPresent() ? enPassant.get().toString() : "-");
        fenJoiner.add(Integer.toString(halfMoveClock));
        fenJoiner.add(Integer.toString(fullMoveNumber));
        return fenJoiner.toString();
    }
}
