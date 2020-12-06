package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertEquals(expect, result);
    }

    @Test
    public void whenArrayHasNot6ThenMinus1() {
        int[] input = {5, 4, 3, 2};
        int value = 6;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertEquals(expect, result);
    }

    @Test
    public void whenArrayHas5InDiapasonThen2() {
        int[] in = {2, 4, 5, 6, 1};
        int value = 5;
        int result = FindLoop.indexOf(in, value, 1, 3);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayNasNot2InDiapasonThenMinus1() {
        int[] in = {2, 4, 5, 6, 1};
        int value = 2;
        int result = FindLoop.indexOf(in, value, 2, 4);
        int expected = -1;
        assertEquals(expected, result);
    }
}