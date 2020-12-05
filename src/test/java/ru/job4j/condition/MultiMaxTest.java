package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        int first = 10;
        int second = 5;
        int third = -3;
        assertEquals(first, MultiMax.max(first, second, third));
    }
}