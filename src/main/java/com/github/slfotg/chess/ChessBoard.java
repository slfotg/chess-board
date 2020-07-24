package com.github.slfotg.chess;

import java.util.Optional;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
public class ChessBoard {

    private final long whitePawns;
    private final long whiteKnights;
    private final long whiteBishops;
    private final long whiteRooks;
    private final long whiteQueens;
    private final long whiteKings;

    private final long blackPawns;
    private final long blackKnights;
    private final long blackBishops;
    private final long blackRooks;
    private final long blackQueens;
    private final long blackKings;

    public static ChessBoard emptyBoard() {
        return new ChessBoard(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public Optional<ColoredPiece> getPieceAt(@NonNull Position position) {
        if (hasPieceAt(whitePawns, position)) {
            return Optional.of(ColoredPiece.WHITE_PAWN);
        }
        if (hasPieceAt(whiteKnights, position)) {
            return Optional.of(ColoredPiece.WHITE_KNIGHT);
        }
        if (hasPieceAt(whiteBishops, position)) {
            return Optional.of(ColoredPiece.WHITE_BISHOP);
        }
        if (hasPieceAt(whiteRooks, position)) {
            return Optional.of(ColoredPiece.WHITE_ROOK);
        }
        if (hasPieceAt(whiteQueens, position)) {
            return Optional.of(ColoredPiece.WHITE_QUEEN);
        }
        if (hasPieceAt(whiteKings, position)) {
            return Optional.of(ColoredPiece.WHITE_KING);
        }
        if (hasPieceAt(blackPawns, position)) {
            return Optional.of(ColoredPiece.BLACK_PAWN);
        }
        if (hasPieceAt(blackKnights, position)) {
            return Optional.of(ColoredPiece.BLACK_KNIGHT);
        }
        if (hasPieceAt(blackBishops, position)) {
            return Optional.of(ColoredPiece.BLACK_BISHOP);
        }
        if (hasPieceAt(blackRooks, position)) {
            return Optional.of(ColoredPiece.BLACK_ROOK);
        }
        if (hasPieceAt(blackQueens, position)) {
            return Optional.of(ColoredPiece.BLACK_QUEEN);
        }
        if (hasPieceAt(blackKings, position)) {
            return Optional.of(ColoredPiece.BLACK_KING);
        }
        return Optional.empty();
    }

    public ChessBoard setPieceAt(@NonNull ColoredPiece piece, @NonNull Position position) {
        long nextWhitePawns = whitePawns;
        long nextWhiteKnights = whiteKnights;
        long nextWhiteBishops = whiteBishops;
        long nextWhiteRooks = whiteRooks;
        long nextWhiteQueens = whiteQueens;
        long nextWhiteKings = whiteKings;

        long nextBlackPawns = blackPawns;
        long nextBlackKnights = blackKnights;
        long nextBlackBishops = blackBishops;
        long nextBlackRooks = blackRooks;
        long nextBlackQueens = blackQueens;
        long nextBlackKings = blackKings;
        if (piece.getColor() == Color.WHITE) {
            switch (piece.getPiece()) {
            case PAWN:
                nextWhitePawns = setPiece(whitePawns, position);
                break;
            case KNIGHT:
                nextWhiteKnights = setPiece(whiteKnights, position);
                break;
            case BISHOP:
                nextWhiteBishops = setPiece(whiteBishops, position);
                break;
            case ROOK:
                nextWhiteRooks = setPiece(whiteRooks, position);
                break;
            case QUEEN:
                nextWhiteQueens = setPiece(whiteQueens, position);
                break;
            case KING:
                nextWhiteKings = setPiece(whiteKings, position);
                break;
            }
        } else {
            switch (piece.getPiece()) {
            case PAWN:
                nextBlackPawns = setPiece(blackPawns, position);
                break;
            case KNIGHT:
                nextBlackKnights = setPiece(blackKnights, position);
                break;
            case BISHOP:
                nextBlackBishops = setPiece(blackBishops, position);
                break;
            case ROOK:
                nextBlackRooks = setPiece(blackRooks, position);
                break;
            case QUEEN:
                nextBlackQueens = setPiece(blackQueens, position);
                break;
            case KING:
                nextBlackKings = setPiece(blackKings, position);
                break;
            }
        }

        return new ChessBoard(nextWhitePawns, nextWhiteKnights, nextWhiteBishops, nextWhiteRooks, nextWhiteQueens,
                nextWhiteKings, nextBlackPawns, nextBlackKnights, nextBlackBishops, nextBlackRooks, nextBlackQueens,
                nextBlackKings);
    }

    private static long positionToBit(Position position) {
        return 1L << position.getIndex();
    }

    private static boolean hasPieceAt(long bitBoard, Position position) {
        return (bitBoard & positionToBit(position)) != 0;
    }

    private static long setPiece(long bitBoard, Position position) {
        return bitBoard | positionToBit(position);
    }

    @SuppressWarnings("unused")
    private static long removePiece(long bitBoard, Position position) {
        return bitBoard & ~positionToBit(position);
    }
}
