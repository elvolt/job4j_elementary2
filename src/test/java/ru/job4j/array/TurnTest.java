package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void testBack1() {
        int[] in = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        int[] out = Turn.back(in);
        assertArrayEquals(expected, out);
    }

    @Test
    public void testBack2() {
        int[] in = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] out = Turn.back(in);
        assertArrayEquals(expected, out);
    }
}