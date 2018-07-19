package com.github.slfotg.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ForsythEdwardsNotationParserTest {

    ForsythEdwardsNotationParser parser = new ForsythEdwardsNotationParser();

    @Test
    public void testParser() {
        String fen = "rnbqkbnr/pp1ppppp/8/2p5/4P3/5N2/PPPP1PPP/RNBQKB1R b KQkq - 1 2";
        ChessBoard board = parser.parseFen(fen);
        assertEquals(fen, board.toFenCode());
    }

    @Test
    public void testParserWithEnPassant() {
        String fen = "rnbqkbnr/pp1ppppp/8/2p5/4P3/8/PPPP1PPP/RNBQKBNR w KQkq c6 0 2";
        ChessBoard board = parser.parseFen(fen);
        assertEquals(fen, board.toFenCode());
    }

    @Test
    public void testParserWithNoRights() {
        String fen = "6k1/2p3pp/8/3P1Q2/6n1/b2P4/P4P1q/5RK1 w - - 0 27";
        ChessBoard board = parser.parseFen(fen);
        assertEquals(fen, board.toFenCode());
    }
}
