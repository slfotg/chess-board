package com.github.slfotg.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ColorTest {

    @Test
    public void testCodes() {
        assertEquals('w', Color.WHITE.getCode());
        assertEquals('b', Color.BLACK.getCode());
    }

    @Test
    public void testFromCode() {
        assertEquals(Color.WHITE, Color.fromCode('w'));
        assertEquals(Color.BLACK, Color.fromCode('b'));
        assertThrows(IllegalArgumentException.class, () -> Color.fromCode('d'));
    }

    @Test
    public void testToString() {
        assertEquals("w", Color.WHITE.toString());
        assertEquals("b", Color.BLACK.toString());
    }
}
