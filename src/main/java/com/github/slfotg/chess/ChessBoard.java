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
    
}
