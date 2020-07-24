package com.github.slfotg.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FileTest {

    @Test
    void testGetCode() {
        assertEquals('a', File.A.getCode());
        assertEquals('b', File.B.getCode());
        assertEquals('c', File.C.getCode());
        assertEquals('d', File.D.getCode());
        assertEquals('e', File.E.getCode());
        assertEquals('f', File.F.getCode());
        assertEquals('g', File.G.getCode());
        assertEquals('h', File.H.getCode());
    }

    @Test
    void testGetIndex() {
        assertEquals(0, File.A.getIndex());
        assertEquals(1, File.B.getIndex());
        assertEquals(2, File.C.getIndex());
        assertEquals(3, File.D.getIndex());
        assertEquals(4, File.E.getIndex());
        assertEquals(5, File.F.getIndex());
        assertEquals(6, File.G.getIndex());
        assertEquals(7, File.H.getIndex());
    }

    @Test
    void testFromCode() {
        assertEquals(File.A, File.fromCode('a'));
        assertEquals(File.B, File.fromCode('b'));
        assertEquals(File.C, File.fromCode('c'));
        assertEquals(File.D, File.fromCode('d'));
        assertEquals(File.E, File.fromCode('e'));
        assertEquals(File.F, File.fromCode('f'));
        assertEquals(File.G, File.fromCode('g'));
        assertEquals(File.H, File.fromCode('h'));

        assertThrows(IllegalArgumentException.class, () -> File.fromCode('A'));
        assertThrows(IllegalArgumentException.class, () -> File.fromCode('B'));
        assertThrows(IllegalArgumentException.class, () -> File.fromCode('C'));
        assertThrows(IllegalArgumentException.class, () -> File.fromCode('D'));
        assertThrows(IllegalArgumentException.class, () -> File.fromCode('E'));
        assertThrows(IllegalArgumentException.class, () -> File.fromCode('F'));
        assertThrows(IllegalArgumentException.class, () -> File.fromCode('G'));
        assertThrows(IllegalArgumentException.class, () -> File.fromCode('H'));
        assertThrows(IllegalArgumentException.class, () -> File.fromCode('*'));
    }

    @Test
    void testToString() {
        assertEquals("a", File.A.toString());
        assertEquals("b", File.B.toString());
        assertEquals("c", File.C.toString());
        assertEquals("d", File.D.toString());
        assertEquals("e", File.E.toString());
        assertEquals("f", File.F.toString());
        assertEquals("g", File.G.toString());
        assertEquals("h", File.H.toString());
    }
}
