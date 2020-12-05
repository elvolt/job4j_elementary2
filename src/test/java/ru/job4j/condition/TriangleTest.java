package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenExist() {
        assertTrue(Triangle.exist(2.0, 2.0, 2.0));
    }

    @Test
    public void whenNotExist() {
        assertFalse(Triangle.exist(1.0, 3.0, 1.0));
    }
}