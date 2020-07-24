package com.github.slfotg.chess.state;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.github.slfotg.chess.Color;
import com.github.slfotg.chess.state.CastlingRights;

public class CastlingRightsTest {

    @Test
    public void testCanCastleKingSide() {
        assertTrue(CastlingRights.BOTH.canCastleKingSide());
        assertTrue(CastlingRights.KING_SIDE.canCastleKingSide());
        assertFalse(CastlingRights.QUEEN_SIDE.canCastleKingSide());
        assertFalse(CastlingRights.NONE.canCastleKingSide());
    }

    @Test
    public void testCanCastleQueenSide() {
        assertTrue(CastlingRights.BOTH.canCastleQueenSide());
        assertFalse(CastlingRights.KING_SIDE.canCastleQueenSide());
        assertTrue(CastlingRights.QUEEN_SIDE.canCastleQueenSide());
        assertFalse(CastlingRights.NONE.canCastleQueenSide());
    }

    @Test
    public void testParseWhiteRights() {
        assertEquals(CastlingRights.BOTH, CastlingRights.parseWhiteRights("KQkq"));
        assertEquals(CastlingRights.BOTH, CastlingRights.parseWhiteRights("KQk"));
        assertEquals(CastlingRights.BOTH, CastlingRights.parseWhiteRights("KQq"));
        assertEquals(CastlingRights.BOTH, CastlingRights.parseWhiteRights("KQ"));
        assertEquals(CastlingRights.KING_SIDE, CastlingRights.parseWhiteRights("Kkq"));
        assertEquals(CastlingRights.KING_SIDE, CastlingRights.parseWhiteRights("Kq"));
        assertEquals(CastlingRights.KING_SIDE, CastlingRights.parseWhiteRights("Kk"));
        assertEquals(CastlingRights.KING_SIDE, CastlingRights.parseWhiteRights("K"));
        assertEquals(CastlingRights.QUEEN_SIDE, CastlingRights.parseWhiteRights("Qkq"));
        assertEquals(CastlingRights.QUEEN_SIDE, CastlingRights.parseWhiteRights("Qq"));
        assertEquals(CastlingRights.QUEEN_SIDE, CastlingRights.parseWhiteRights("Qk"));
        assertEquals(CastlingRights.QUEEN_SIDE, CastlingRights.parseWhiteRights("Q"));
        assertEquals(CastlingRights.NONE, CastlingRights.parseWhiteRights("kq"));
        assertEquals(CastlingRights.NONE, CastlingRights.parseWhiteRights("q"));
        assertEquals(CastlingRights.NONE, CastlingRights.parseWhiteRights("k"));
        assertEquals(CastlingRights.NONE, CastlingRights.parseWhiteRights("-"));
    }

    @Test
    public void testParseBlackRights() {
        assertEquals(CastlingRights.BOTH, CastlingRights.parseBlackRights("KQkq"));
        assertEquals(CastlingRights.KING_SIDE, CastlingRights.parseBlackRights("KQk"));
        assertEquals(CastlingRights.QUEEN_SIDE, CastlingRights.parseBlackRights("KQq"));
        assertEquals(CastlingRights.NONE, CastlingRights.parseBlackRights("KQ"));
        assertEquals(CastlingRights.BOTH, CastlingRights.parseBlackRights("Kkq"));
        assertEquals(CastlingRights.QUEEN_SIDE, CastlingRights.parseBlackRights("Kq"));
        assertEquals(CastlingRights.KING_SIDE, CastlingRights.parseBlackRights("Kk"));
        assertEquals(CastlingRights.NONE, CastlingRights.parseBlackRights("K"));
        assertEquals(CastlingRights.BOTH, CastlingRights.parseBlackRights("Qkq"));
        assertEquals(CastlingRights.QUEEN_SIDE, CastlingRights.parseBlackRights("Qq"));
        assertEquals(CastlingRights.KING_SIDE, CastlingRights.parseBlackRights("Qk"));
        assertEquals(CastlingRights.NONE, CastlingRights.parseBlackRights("Q"));
        assertEquals(CastlingRights.BOTH, CastlingRights.parseBlackRights("kq"));
        assertEquals(CastlingRights.QUEEN_SIDE, CastlingRights.parseBlackRights("q"));
        assertEquals(CastlingRights.KING_SIDE, CastlingRights.parseBlackRights("k"));
        assertEquals(CastlingRights.NONE, CastlingRights.parseBlackRights("-"));
    }

    @Test
    public void testToString() {
        assertEquals("KQ", CastlingRights.BOTH.toString(Color.WHITE));
        assertEquals("K", CastlingRights.KING_SIDE.toString(Color.WHITE));
        assertEquals("Q", CastlingRights.QUEEN_SIDE.toString(Color.WHITE));
        assertEquals("", CastlingRights.NONE.toString(Color.WHITE));

        assertEquals("kq", CastlingRights.BOTH.toString(Color.BLACK));
        assertEquals("k", CastlingRights.KING_SIDE.toString(Color.BLACK));
        assertEquals("q", CastlingRights.QUEEN_SIDE.toString(Color.BLACK));
        assertEquals("", CastlingRights.NONE.toString(Color.BLACK));
    }
}
