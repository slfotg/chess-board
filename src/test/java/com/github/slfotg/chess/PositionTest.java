package com.github.slfotg.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    public void testAllRankAndFiles() {
        String[] letters = new String[] { "a", "b", "c", "d", "e", "f", "g", "h" };
        String[] numbers = new String[] { "1", "2", "3", "4", "5", "6", "7", "8" };
        for (int i = 0; i < Rank.ORDERED_RANKS.length; i += 1) {
            for (int j = 0; j < File.ORDERED_FILES.length; j += 1) {
                Position position = new Position(Rank.ORDERED_RANKS[i], File.ORDERED_FILES[j]);
                assertEquals(i * 8 + j, position.getIndex());
                assertEquals(Rank.ORDERED_RANKS[i], position.getRank());
                assertEquals(File.ORDERED_FILES[j], position.getFile());
                assertEquals(letters[j] + numbers[i], position.toString());
            }
        }
    }

    @Test
    public void testPositionNullRank() {
        assertThrows(IllegalArgumentException.class, () -> new Position(null, File.A));
    }

    @Test
    public void testPositionNullFile() {
        assertThrows(IllegalArgumentException.class, () -> new Position(Rank.ONE, null));
    }
}
