package com.github.slfotg.chess.state;

import com.github.slfotg.chess.ChessBoard;
import com.github.slfotg.chess.Color;
import com.github.slfotg.chess.Position;

public class GameState {

    private final ChessBoard board = ChessBoard.emptyBoard();

    protected final Color activeColor = Color.WHITE;
    protected final Position enPassant = null;
    protected final CastlingRights whiteCastlingRights = CastlingRights.BOTH;
    protected final CastlingRights blackCastlingRights = CastlingRights.BOTH;
    protected final int fullMoveNumber = 0;
    protected final int halfMoveClock = 0;
}
