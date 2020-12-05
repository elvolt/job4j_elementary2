package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenLeftGreaterThenLeft() {
        int left = 4;
        int right = 1;
        assertEquals(left, Max.max(left, right));
    }

    @Test
    public void whenRightGreaterThenRight() {
        int left = 2;
        int right = 6;
        assertEquals(right, Max.max(left, right));
    }

    @Test
    public void whenEqualsThenRight() {
        int left = 4;
        int right = 4;
        assertEquals(right, Max.max(left, right));
    }
}