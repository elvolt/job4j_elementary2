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
}