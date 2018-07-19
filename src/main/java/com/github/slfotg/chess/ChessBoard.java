package com.github.slfotg.chess;

import java.util.Optional;
import java.util.StringJoiner;

public class ChessBoard {

    protected BitBoard whitePawns = new BitBoard(0L);
    protected BitBoard whiteKnights = new BitBoard(0L);
    protected BitBoard whiteBishops = new BitBoard(0L);
    protected BitBoard whiteRooks = new BitBoard(0L);
    protected BitBoard whiteQueens = new BitBoard(0L);
    protected BitBoard whiteKings = new BitBoard(0L);

    protected BitBoard blackPawns = new BitBoard(0L);
    protected BitBoard blackKnights = new BitBoard(0L);
    protected BitBoard blackBishops = new BitBoard(0L);
    protected BitBoard blackRooks = new BitBoard(0L);
    protected BitBoard blackQueens = new BitBoard(0L);
    protected BitBoard blackKings = new BitBoard(0L);

    protected Color activeColor = Color.WHITE;
    protected Optional<Position> enPassant = Optional.empty();
    protected CastlingRights whiteCastlingRights = CastlingRights.BOTH;
    protected CastlingRights blackCastlingRights = CastlingRights.BOTH;
    protected int fullMoveNumber = 0;
    protected int halfMoveClock = 0;

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
                    rankBuilder.append(piece.get().getFenCode());
                } else {
                    skips += 1;
                }
            }
            if (skips > 0) {
                rankBuilder.append(Integer.toString(skips));
            }
            pieceJoiner.add(rankBuilder.toString());
        }
        fenJoiner.add(pieceJoiner.toString());
        fenJoiner.add(activeColor.toString());
        fenJoiner.add(CastlingRights.toString(whiteCastlingRights, blackCastlingRights));
        fenJoiner.add(enPassant.isPresent() ? enPassant.get().toString() : "-");
        fenJoiner.add(Integer.toString(halfMoveClock));
        fenJoiner.add(Integer.toString(fullMoveNumber));
        return fenJoiner.toString();
    }

    public void setPieceAt(ColoredPiece piece, Position position) {
        if (piece == null) {
            throw new IllegalArgumentException("ColoredPiece cannot be null");
        }
        if (position == null) {
            throw new IllegalArgumentException("Position cannot be null");
        }
        if (piece.getColor() == Color.WHITE) {
            switch(piece.getPiece()) {
            case PAWN:
                whitePawns.setPiece(position);
                break;
            case KNIGHT:
                whiteKnights.setPiece(position);
                break;
            case BISHOP:
                whiteBishops.setPiece(position);
                break;
            case ROOK:
                whiteRooks.setPiece(position);
                break;
            case QUEEN:
                whiteQueens.setPiece(position);
                break;
            case KING:
                whiteKings.setPiece(position);
                break;
            }
        } else {
            switch(piece.getPiece()) {
            case PAWN:
                blackPawns.setPiece(position);
                break;
            case KNIGHT:
                blackKnights.setPiece(position);
                break;
            case BISHOP:
                blackBishops.setPiece(position);
                break;
            case ROOK:
                blackRooks.setPiece(position);
                break;
            case QUEEN:
                blackQueens.setPiece(position);
                break;
            case KING:
                blackKings.setPiece(position);
                break;
            }
        }
    }
}
