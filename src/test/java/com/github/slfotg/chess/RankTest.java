package com.github.slfotg.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RankTest {

    @Test
    public void testFromCode() {
        assertEquals(Rank.ONE, Rank.fromCode('1'));
        assertEquals(Rank.TWO, Rank.fromCode('2'));
        assertEquals(Rank.THREE, Rank.fromCode('3'));
        assertEquals(Rank.FOUR, Rank.fromCode('4'));
        assertEquals(Rank.FIVE, Rank.fromCode('5'));
        assertEquals(Rank.SIX, Rank.fromCode('6'));
        assertEquals(Rank.SEVEN, Rank.fromCode('7'));
        assertEquals(Rank.EIGHT, Rank.fromCode('8'));
        assertThrows(IllegalArgumentException.class, () -> Rank.fromCode('0'));
    }

    @Test
    public void testGetRankNumber() {
        assertEquals(1, Rank.ONE.getRankNumber());
        assertEquals(2, Rank.TWO.getRankNumber());
        assertEquals(3, Rank.THREE.getRankNumber());
        assertEquals(4, Rank.FOUR.getRankNumber());
        assertEquals(5, Rank.FIVE.getRankNumber());
        assertEquals(6, Rank.SIX.getRankNumber());
        assertEquals(7, Rank.SEVEN.getRankNumber());
        assertEquals(8, Rank.EIGHT.getRankNumber());
    }

    @Test
    public void testGetIndex() {
        assertEquals(0, Rank.ONE.getIndex());
        assertEquals(1, Rank.TWO.getIndex());
        assertEquals(2, Rank.THREE.getIndex());
        assertEquals(3, Rank.FOUR.getIndex());
        assertEquals(4, Rank.FIVE.getIndex());
        assertEquals(5, Rank.SIX.getIndex());
        assertEquals(6, Rank.SEVEN.getIndex());
        assertEquals(7, Rank.EIGHT.getIndex());
    }

    @Test
    public void testToString() {
        assertEquals("1", Rank.ONE.toString());
        assertEquals("2", Rank.TWO.toString());
        assertEquals("3", Rank.THREE.toString());
        assertEquals("4", Rank.FOUR.toString());
        assertEquals("5", Rank.FIVE.toString());
        assertEquals("6", Rank.SIX.toString());
        assertEquals("7", Rank.SEVEN.toString());
        assertEquals("8", Rank.EIGHT.toString());
    }
}
